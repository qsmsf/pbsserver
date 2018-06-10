package com.easyfly.main.controller;

import cn.gov.szga.s3.UpoladFileResponse;
import cn.gov.szga.s3.UpoladFlieRequest;
import com.alibaba.fastjson.JSON;
import com.easyfly.main.base.controller.BaseController;
import com.easyfly.main.bean.MyProps;
import com.easyfly.main.bean.SysUploadFile;
import com.easyfly.main.bean.UploadFileResultBean;
import com.easyfly.main.dao.SysUploadFileMapper;
import com.easyfly.main.util.CodeMsg;
import com.easyfly.main.util.JSONUtil;
import com.easyfly.main.util.ReturnJSON;
import com.xinghuo.sso.LoginUserInfo;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/uploadFiles")
public class UploadFileController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysUploadFileMapper sysUploadFileMapper;

    @Autowired
    private MyProps myProps;

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/getRecordFileList")
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
    public ReturnJSON getFileInfo() {
        int fileId =  Integer.parseInt(getParam());
        SysUploadFile result = sysUploadFileMapper.selectByPrimaryKey(fileId);

        return setReturnJson(result, CodeMsg.C604);
    }

    @CrossOrigin
    @ResponseBody
    @Transactional
    @PostMapping("/addFileInfo")
    public ReturnJSON addFileInfo() {
        SysUploadFile file = getHeaderInJSON(SysUploadFile.class, "file");
        int rsl = sysUploadFileMapper.insertSelective(file);

        return setReturnJson("", CodeMsg.C604);
    }

    @CrossOrigin
    @Transactional
    @GetMapping("/downloadFile")
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
    public ReturnJSON uploadFile() throws Exception{
        String uuid = getHeader("uuid");
        if(uuid.equals("")){
            return setReturnJson("主键为空", CodeMsg.C702);
        }
        Part part = request.getPart("file");
        InputStream is = part.getInputStream();
        SysUploadFile fileInfo = new SysUploadFile();

        if(myProps.getDebugMode())
        {
            String pathName = request.getSession().getServletContext().getRealPath("")+"/data/";
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


            fileInfo.setFileName(newFileName + fileExtType);
            fileInfo.setFileType(2001);
            fileInfo.setFileHint(part.getSubmittedFileName());
            fileInfo.setFileUploader("1");
            String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath();
            fileInfo.setFileUrl(basePath+"/uploadFiles/downloadFile?fileName="+part.getSubmittedFileName());
            fileInfo.setRecUuid(uuid);
            fileInfo.setThumbnailUrl(fileInfo.getFileUrl());
            fileInfo.setFileUploadTime(new Date());
        }
        /* 公安内网
        FileInputStream fis = (FileInputStream) (is);
        LoginUserInfo user = getCurrentUser();
        UpoladFlieRequest request = new UpoladFlieRequest(user.getToken());
        UpoladFileResponse response = request.sendFileStreamRequest(fis ,APPCODE ,part.getSubmittedFileName());
        if(!response.isSuccess()){
            return setReturnJson(CodeMsg.C703_MSG, CodeMsg.C703);
        }
        UploadFileResultBean result = JSONUtil.parseObject(response.getResult(), UploadFileResultBean.class);
        SysUploadFile fileInfo = new SysUploadFile();
        fileInfo.setFileName(result.getKey());
        fileInfo.setFileType(2001);
        fileInfo.setFileUploader(user.getUserCode());
        fileInfo.setFileUrl(result.getFile_url());
        fileInfo.setRecUuid(uuid);
        fileInfo.setThumbnailUrl(result.getFile_url());
        fileInfo.setFileUploadTime(new Date());

        */
        //本地测试


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
    public ReturnJSON updateFileInfo() {
        SysUploadFile file = getHeaderInJSON(SysUploadFile.class, "file");
        int rsl = sysUploadFileMapper.updateByPrimaryKeySelective(file);

        return setReturnJson("", CodeMsg.C604);
    }

    @CrossOrigin
    @ResponseBody
    @Transactional
    @PostMapping("/deleteFileInfo")
    public ReturnJSON deleteFileInfo() {
        int fileId =  Integer.parseInt(getHeader("fileId"));
        int rsl = sysUploadFileMapper.deleteByPrimaryKey(fileId);
        if(rsl != 1){

        }

        return setReturnJson("", CodeMsg.C604);
    }
}
