package com.easyfly.main.controller;

import com.alibaba.fastjson.JSON;
import com.easyfly.main.base.controller.BaseController;
import com.easyfly.main.bean.MyProps;
import com.easyfly.main.bean.SysUploadFile;
import com.easyfly.main.bean.UploadFileResultBean;
import com.easyfly.main.bean.XhUploadFileResponse;
import com.easyfly.main.dao.SysUploadFileMapper;
import com.easyfly.main.util.CodeMsg;
import com.easyfly.main.util.JSONUtil;
import com.easyfly.main.util.ReturnJSON;
import com.easyfly.main.util.UploadUtil;
import com.szga.xinghuo.api.base.ApiException;
import com.szga.xinghuo.api.base.DefaultXHClient;
import com.szga.xinghuo.api.base.XhClient;
import com.szga.xinghuo.api.base.util.MethodEnum;
import com.szga.xinghuo.api.base.util.XhHashMap;
import com.szga.xinghuo.api.domain.BaseUpoladFileBean;
import com.szga.xinghuo.api.request.BaseUploadFileRequest;
import com.szga.xinghuo.api.response.BaseUpoladFileResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.util.*;

@RestController
@RequestMapping("/uploadFiles")
@Api(value = "/uploadFiles", description = "uploadFiles Controller")//必须
public class UploadFileController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysUploadFileMapper sysUploadFileMapper;

    @Autowired
    private MyProps myProps;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/getRecordFileList")
    @ApiOperation(value = "getRecordFileList",
            notes = "获得记录相关文件信息"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="header",name="uuid",dataType="String",required=true,value="记录内部uuid",defaultValue="")
    })
    @Transactional
    public ReturnJSON getRecordFileList(){
        String uuid = getHeader("uuid");
        if(uuid.equals("")){
            return setReturnJson("主键为空", CodeMsg.C702);
        }
        List<SysUploadFile> result = sysUploadFileMapper.selectByUuid(uuid);

        return setReturnJson(result, CodeMsg.C604);
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/getFileInfo")
    @ApiOperation(value = "getFileInfo",
            notes = "获得文件信息"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query",name="param",dataType="String",required=true,value="文件编号",defaultValue="")
    })
    @Transactional
    public ReturnJSON getFileInfo() {
        int fileId =  Integer.parseInt(getParam());
        SysUploadFile result = sysUploadFileMapper.selectByPrimaryKey(fileId);

        return setReturnJson(result, CodeMsg.C604);
    }

    @CrossOrigin
    @ResponseBody
    @Transactional
    @PostMapping("/addFileInfo")
    @ApiOperation(value = "addFileInfo",
            notes = "添加文件信息"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="body",name="fileInfo",dataType="String",required=true,value="文件信息json字符串",defaultValue="")
    })
    public ReturnJSON addFileInfo() {
        SysUploadFile file = JSONUtil.parseObject(getParameter("fileInfo"),SysUploadFile.class);
        int rsl = sysUploadFileMapper.insertSelective(file);
        if(rsl != 1){
            logger.error("插入失败 :  ="+file.getRecUuid());
            return setReturnJson("插入记录失败", CodeMsg.C701);
        }
        return setReturnJson("", CodeMsg.C604);
    }

    @CrossOrigin
    @Transactional
    @GetMapping("/downloadFile")
    @ApiOperation(value = "downloadFile",
            notes = "下载文件"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query",name="fileName",dataType="String",required=true,value="文件名",defaultValue="")
    })
    public void downloadFile(String fileName, HttpServletResponse response) {
        ServletContext context = request.getServletContext();
        String filePath = context.getRealPath("/") + "/data/" + fileName;
        File file = new File(filePath);
        if(file.exists()){ //判断文件父目录是否存在
            // get MIME type of the file
            String mimeType = context.getMimeType(filePath);
            if (mimeType == null) {
                // set to binary type if MIME mapping not found
                mimeType = "application/octet-stream";
            }
            response.setContentType(mimeType);
            response.setContentLength((int) file.length());
            response.setHeader("Content-Disposition", "attachment;fileName=" + fileName);

            try {
                InputStream myStream = new FileInputStream(filePath);
                IOUtils.copy(myStream, response.getOutputStream());
                response.flushBuffer();
            } catch (IOException e) {
                logger.error("download file error. message: "+e.getMessage());
            }
        }
    }

    @CrossOrigin
    @ResponseBody
    @Transactional
    @PostMapping("/uploadFile")
    @ApiOperation(value = "uploadFile",
            notes = "上传文件"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="header",name="uuid",dataType="String",required=true,value="记录内部uuid",defaultValue=""),
            @ApiImplicitParam(paramType="body",name="file",dataType="file",required=true,value="文件流",defaultValue="")
    })
    public ReturnJSON uploadFile() throws Exception {
        String uuid = getHeader("uuid");
        if (uuid.equals("")) {
            return setReturnJson("主键为空", CodeMsg.C702);
        }

        Part part = request.getPart("file");
        InputStream is = part.getInputStream();
        SysUploadFile fileInfo = new SysUploadFile();

        String pathName = request.getSession().getServletContext().getRealPath("") + "/data/";
        String newFileName = (new Date()).getTime() + "";
        String fileExtType = part.getSubmittedFileName().substring(part.getSubmittedFileName().lastIndexOf('.'));

        File file = new File(pathName + newFileName + fileExtType);
        OutputStream os = new FileOutputStream(file);
        int bytesRead = 0;
        byte[] buffer = new byte[8192];
        while ((bytesRead = is.read(buffer, 0, 8192)) != -1) {
            os.write(buffer, 0, bytesRead);
        }
        os.close();
        is.close();


        if (part.getSubmittedFileName().equals(uuid + ".png")) {
            fileInfo.setFileType(2006);
        } else if (part.getSubmittedFileName().equals(uuid + "_xct.jpeg")) {
            fileInfo.setFileType(2007);
        } else if (part.getSubmittedFileName().equals(uuid + "_pmt.jpeg")) {
            fileInfo.setFileType(2008);
        } else {
            fileInfo.setFileType(2001);
        }
        fileInfo.setFileUploadTime(new Date());
        fileInfo.setRecUuid(uuid);

        fileInfo.setFileName(newFileName + fileExtType);
        fileInfo.setFileUploader("1");

        if (myProps.getDebugMode()){
    //            fileInfo.setFileHint(part.getSubmittedFileName());
            String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
            fileInfo.setFileUrl(basePath + "/uploadFiles/downloadFile?fileName=" + fileInfo.getFileName());

            fileInfo.setThumbnailUrl(fileInfo.getFileUrl());
        }
        //本地测试
        else {
            XhUploadFileResponse resp = UploadUtil.uploadToXh(newFileName + fileExtType, file);
            if(resp.getCode() == 200){
                //List<UploadFileResultBean> rslList = JSON.parseArray(resp.getResult(), UploadFileResultBean.class);
                List<UploadFileResultBean> rslList = resp.getResult();
                if(rslList.size() > 0){
                    fileInfo.setFileUrl(rslList.get(0).getData().getFileUrl());
                    fileInfo.setThumbnailUrl(rslList.get(0).getData().getFileUrl());
                }else{
                    return setReturnJson(CodeMsg.C703_MSG, CodeMsg.C703);
                }
            }else{
                return setReturnJson(CodeMsg.C703_MSG, CodeMsg.C703);
            }
        }
        //
        int rsl = sysUploadFileMapper.insertSelective(fileInfo);
        if( rsl != 1){
            return setReturnJson(CodeMsg.C703_MSG, CodeMsg.C703);
        }
        return setReturnJson(fileInfo, CodeMsg.C604);
    }

    @CrossOrigin
    @ResponseBody
    @Transactional
    @PostMapping("/updateFileInfo")
    @ApiOperation(value = "updateFileInfo",
            notes = "更新文件信息"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="header",name="file",dataType="String",required=true,value="文件信息json字符串",defaultValue="")
    })
    public ReturnJSON updateFileInfo() {
        SysUploadFile file = getHeaderInJSON(SysUploadFile.class, "file");
        int rsl = sysUploadFileMapper.updateByPrimaryKeySelective(file);

        return setReturnJson("", CodeMsg.C604);
    }

    @CrossOrigin
    @ResponseBody
    @Transactional
    @PostMapping("/deleteFileInfo")
    @ApiOperation(value = "deleteFileInfo",
            notes = "删除文件信息"
    )
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="header",name="fileId",dataType="String",required=true,value="文件信息编号",defaultValue="")
    })
    public ReturnJSON deleteFileInfo() {
        int fileId =  Integer.parseInt(getHeader("fileId"));
        int rsl = sysUploadFileMapper.deleteByPrimaryKey(fileId);
        if(rsl != 1){

        }

        return setReturnJson("", CodeMsg.C604);
    }
}
