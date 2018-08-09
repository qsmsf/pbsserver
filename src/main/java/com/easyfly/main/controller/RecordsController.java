package com.easyfly.main.controller;

import com.alibaba.fastjson.JSON;
import com.easyfly.main.base.controller.BaseController;
import com.easyfly.main.bean.*;
import com.easyfly.main.dao.PbsRecordMapper;
import com.easyfly.main.dao.SysUploadFileMapper;
import com.easyfly.main.dao.ViewRecord2WordMapper;
import com.easyfly.main.util.CodeMsg;
import com.easyfly.main.util.JSONUtil;
import com.easyfly.main.util.OfficeUtil;
import com.easyfly.main.util.ReturnJSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;
import java.io.*;
import java.util.*;

@RestController
@RequestMapping("/records")
@Api(value = "/records", description = "Records Controller")//必须
public class RecordsController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PbsRecordMapper pbsRecordMapper;
    @Autowired
    private SysUploadFileMapper sysUploadFileMapper;
    @Autowired
    private ViewRecord2WordMapper viewRecord2WordMapper;
    @Autowired
    private DocumentBuilder documentBuilder;
    @Autowired
    private MyProps myProps;

    public class GetRecentRecordListResponse{
        private int rowNum;
        private List<PbsRecord> pbsList;

        public int getRowNum() {
            return rowNum;
        }

        public void setRowNum(int rowNum) {
            this.rowNum = rowNum;
        }

        public List<PbsRecord> getPbsList() {
            return pbsList;
        }

        public void setPbsList(List<PbsRecord> pbsList) {
            this.pbsList = pbsList;
        }
    }

    @ResponseBody
    @PostMapping("/getRecentRecordList")
    @CrossOrigin
    @ApiOperation(value = "getRecentRecordList",
            notes = "get record list"
    )
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    @Transactional
    public ReturnJSON getRecentRecordList() {
        //{"kyDateBegin":"2017-12-15","kyDateEnd":"2017-12-15","kyUnitId":1,"kyrName":"马","limit":10,"offset":0,"recState":1001,"recordNo":"300","recordTitle":"kk"}
        RecordFilterBean filter = JSONUtil.parseObject(getParameter("filter"),RecordFilterBean.class);
        if(filter != null) {
            String json = JSONUtil.toJSON2(filter);
            logger.debug(json);
            List<PbsRecord> pr = pbsRecordMapper.selectByPrimaryCondition(filter);
            int rowNum = pbsRecordMapper.selectRowNumByCondition(filter);

            GetRecentRecordListResponse resp  = new GetRecentRecordListResponse();
            resp.setRowNum(rowNum);
            resp.setPbsList(pr);
            return setReturnJson(resp, CodeMsg.C604);
        }else{
            return setReturnJson("查询失败", CodeMsg.C702);
        }
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/getRecordDetail")
    @Transactional
    public ReturnJSON getRecord() {
        int recId =  Integer.parseInt(getHeader("recId"));
        PbsRecord pr = pbsRecordMapper.selectByPrimaryKey(recId);
        return setReturnJson(pr, CodeMsg.C604);
    }

//    @CrossOrigin
//    @ResponseBody
//    @RequestMapping("/buildWord")
//    public ReturnJSON buildWord() throws Exception{
//        int recId =  Integer.parseInt(getHeader("recId"));
//        //ViewRecord2WordWithBLOBs record = viewRecord2WordMapper.selectByRecId(recId);
//
//        String tmpFile = "classpath:template.doc";
//
//        Map<String, String> datas = new HashMap<String, String>();
//        datas.put("title", "标题部份");
//        datas.put("content", "这里是内容，测试使用POI导出到Word的内容！");
//        datas.put("author", "知识林");
//        datas.put("url", "http://www.zslin.com");
//
//        ByteArrayOutputStream bos = OfficeUtil.buildWord(ResourceUtils.getFile(tmpFile), datas);
//
//        //上传文件服务器
//        //获取下载地址及相关信息
//        return setReturnJson("", CodeMsg.C604);
//    }

    @CrossOrigin
    @ResponseBody
    @Transactional
    @PostMapping("/addRecord")
    public ReturnJSON addRecord() throws IOException{
        List<SysUploadFile> fileList = JSON.parseArray(getParameter("fileList"), SysUploadFile.class);
        PbsRecordWithBLOBs record = JSONUtil.parseObject(getParameter("record") ,PbsRecordWithBLOBs.class);
        int rsl = pbsRecordMapper.insertSelective(record);
        if(rsl != 1){
            logger.error("插入失败 :  ="+record.getUuid());
            return setReturnJson("插入记录失败", CodeMsg.C701);
        }
        String recNo = record.getRecordId().toString();

        for(int i = 0; i< 5-record.getRecordId().toString().length();i++){
            recNo = "0"+recNo;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        recNo = "440300" + c.get(Calendar.YEAR) +recNo;
        record.setRecordNo(recNo);
        rsl = pbsRecordMapper.updateRecordNo(record);
        if(rsl != 1){
            logger.error("更新失败: recNo ="+recNo);
            return setReturnJson("更新编号失败", CodeMsg.C701);
        }
        for(SysUploadFile fileInfo : fileList){
            if(fileInfo.getFileId() == 0){
                rsl = sysUploadFileMapper.insertSelective(fileInfo);
            }else{
                rsl = sysUploadFileMapper.updateByPrimaryKeySelective(fileInfo);
            }
        }
        if(record.getRecState() == 1004){
            logger.info("begin to build document...");
            documentBuilder.wordBuild(record.getRecordId(), request.getSession().getServletContext().getRealPath("")+"/data/");
        }
        return setReturnJson(recNo, CodeMsg.C604);
    }

    @CrossOrigin
    @ResponseBody
    @Transactional
    @PostMapping("/updateRecord")
    public ReturnJSON updateRecord() throws IOException{
        List<SysUploadFile> fileList = JSON.parseArray(getParameter("fileList"), SysUploadFile.class);
        PbsRecordWithBLOBs record = JSONUtil.parseObject(getParameter("record") ,PbsRecordWithBLOBs.class);
        int rsl = pbsRecordMapper.updateByPrimaryKeySelective(record);
        if(rsl != 1){
            logger.error("更新失败 :  ="+record.getUuid());
            return setReturnJson("更新记录失败", CodeMsg.C701);
        }
        for(SysUploadFile fileInfo : fileList){
            if(fileInfo.getFileId() == 0){
                rsl = sysUploadFileMapper.insertSelective(fileInfo);
            }else{
                rsl = sysUploadFileMapper.updateByPrimaryKeySelective(fileInfo);
            }
        }
        if(record.getRecState() == 1004){
            logger.info("begin to build document...");
            documentBuilder.wordBuild(record.getRecordId(), request.getSession().getServletContext().getRealPath("")+"/data/");
        }
        return setReturnJson("", CodeMsg.C604);
    }

    @CrossOrigin
    @ResponseBody
    @Transactional
    @PostMapping("/checkRecord")
    public ReturnJSON checkRecord() throws IOException{
        PbsRecordWithBLOBs record = JSONUtil.parseObject(getParameter("record") ,PbsRecordWithBLOBs.class);
        int rsl = pbsRecordMapper.updateCheckInfo(record);
        if(rsl != 1){
            logger.error("更新失败 :  ="+record.getUuid());
            return setReturnJson(CodeMsg.C704_MSG, CodeMsg.C704);
        }
        if(record.getRecState() == 1004){
            documentBuilder.wordBuild(record.getRecordId(), request.getSession().getServletContext().getRealPath("")+"/data/");
        }
        return setReturnJson("", CodeMsg.C604);
    }

    @CrossOrigin
    @ResponseBody
    @Transactional
    @PostMapping("/deleteRecord")
    public ReturnJSON deleteRecord() {
        int recId =  Integer.parseInt(getHeader("recId"));
        int rsl = pbsRecordMapper.deleteByPrimaryKey(recId);
        if(rsl != 1){
            logger.error("删除失败:  recId ="+recId);
        }
        return setReturnJson("", CodeMsg.C604);
    }
}
