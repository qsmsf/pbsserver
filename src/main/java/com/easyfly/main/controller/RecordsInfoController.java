package com.easyfly.main.controller;

import com.easyfly.main.base.controller.BaseController;
import com.easyfly.main.bean.PbsRecord;
import com.easyfly.main.bean.RecordFilterBean;
import com.easyfly.main.dao.RecordInfoMapper;
import com.easyfly.main.util.CodeMsg;
import com.easyfly.main.util.JSONUtil;
import com.easyfly.main.util.ReturnJSON;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@RequestMapping("/recordsInfo")
@Api(value = "/recordsInfo", description = "RecordsInfo Controller")//必须
public class RecordsInfoController extends BaseController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RecordInfoMapper recordInfoMapper;

    /*
    @ResponseBody
    @PostMapping("/getRecentRecordList")
    @CrossOrigin
    @ApiOperation(value = "getRecentRecordList",
            notes = "get record list"
    )
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON })
    public ReturnJSON getRecordInfoList() {
        //{"kyDateBegin":"2017-12-15","kyDateEnd":"2017-12-15","kyUnitId":1,"kyrName":"马","limit":10,"offset":0,"recState":1001,"recordNo":"300","recordTitle":"kk"}
        RecordFilterBean filter = JSONUtil.parseObject(getParameter("filter"),RecordFilterBean.class);
        if(filter != null) {
            String json = JSONUtil.toJSON2(filter);
            logger.debug(json);
            //List<PbsRecord> pr = recordInfoMapper..selectByPrimaryCondition(filter);
            //int rowNum = recordInfoMapper.selectRowNumByCondition(filter);

            RecordsController.GetRecentRecordListResponse resp  = new recordInfoMapper.GetRecentRecordListResponse();
            resp.setRowNum(rowNum);
            resp.setPbsList(pr);
            return setReturnJson(resp, CodeMsg.C604);
        }else{
            return setReturnJson("查询失败", CodeMsg.C702);
        }
    }
    */
}
