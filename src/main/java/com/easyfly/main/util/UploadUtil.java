package com.easyfly.main.util;

import com.easyfly.main.bean.XhUploadFileResponse;
import com.szga.xinghuo.api.base.ApiException;
import com.szga.xinghuo.api.base.DefaultXHClient;
import com.szga.xinghuo.api.base.XhClient;
import com.szga.xinghuo.api.base.util.MethodEnum;
import com.szga.xinghuo.api.base.util.XhHashMap;
import com.szga.xinghuo.api.domain.BaseUpoladFileBean;
import com.szga.xinghuo.api.request.BaseUploadFileRequest;
import com.szga.xinghuo.api.response.BaseUpoladFileResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UploadUtil {
    private final static Logger logger = LoggerFactory.getLogger("UploadUtil");

    public static XhUploadFileResponse uploadToXh(String fileName, File file){

        XhClient client = new DefaultXHClient();
        BaseUploadFileRequest request = new BaseUploadFileRequest();
        // 设置请求那个服务
        request.setServiceName("xinghuo-apaas-fileservice");
        // 设置请求那个接口
        request.setInterfaceName("breakMultiUploads");
        // 设置用什么方式请求 ，目前支持四种请求：post ,get ,put ,delete
        request.setMethod(MethodEnum.REQUEST_Method_POST);
        // 设置请求协议，http 或者是 HTTPS，默认是http协议请求
        request.setRequestHttpType(MethodEnum.REQUEST_HTTP_TYPE);
        // 设置请求头参数
        Map<String, String> headerMap = new XhHashMap();
        request.setHeaderMap(headerMap);
        // 设置接口参数
        Map<String, String> params = new XhHashMap();
        request.setParamMap(params);
        List<File> list = new ArrayList<File>();
        list.add(file);
        request.setFileList(list);
        try {
            // 开始调用接口
            BaseUpoladFileResponse response = client.execute(request, System.currentTimeMillis());
            logger.debug(response.getBody().toString());
            XhUploadFileResponse rsl = JSONUtil.parseObject(response.getBody().toString(),XhUploadFileResponse.class);
            return rsl;

        } catch (ApiException e) {
            logger.debug(e.getErrCode() +  " : " + e.getErrMsg());
            e.printStackTrace();
            return null;
        }
    }
}
