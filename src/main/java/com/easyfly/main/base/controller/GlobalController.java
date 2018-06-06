package com.easyfly.main.base.controller;

import com.alibaba.fastjson.JSONException;
import com.easyfly.main.base.exception.InvalidTokenException;
import com.easyfly.main.base.exception.NoTokenException;
import com.easyfly.main.util.CodeMsg;
import com.easyfly.main.util.Constant;
import com.easyfly.main.util.ReturnJSON;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 全局控制器
 *
 * @author chencan
 */
@ControllerAdvice
@ResponseBody
public class GlobalController {
	
	private static final Logger logger1 = LoggerFactory.getLogger("GlobalController");
	
    /**
     * 处理异常
     */
    @ExceptionHandler
    @ResponseBody
    public ReturnJSON handleException(HttpServletRequest request, Exception e) {
        e.printStackTrace();
        ReturnJSON json = new ReturnJSON();
        json.setCmd(request.getRequestURI());
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);
        String s = stringWriter.toString();
        logger1.error(s);
        String separator = "\r\n\t";
        int i = s.indexOf(separator);
        String errCause = "，详细错误信息：" + s.substring(0, i) + ", " + s.substring(i + 3, s.indexOf(separator, i + 6));
        int j;
        String cause = "Caused by:";
        if ((j = s.lastIndexOf(cause)) != -1)
            errCause += "；" + s.substring(j, s.indexOf(separator, j + 10));
        String msg;
        if (e instanceof HttpMessageNotReadableException) {//@RequestBody
            json.setCode(CodeMsg.C600);
            msg = CodeMsg.C600_MSG;
        } else if (e instanceof JSONException) {
            json.setCode(CodeMsg.C601);
            msg = CodeMsg.C601_MSG;
        } else if (e instanceof NoTokenException) {
            json.setCode(CodeMsg.C602);
            msg = CodeMsg.C602_MSG;
        } else if (e instanceof InvalidTokenException) {
            json.setCode(CodeMsg.C603);
            msg = CodeMsg.C603_MSG;
        } else {
            json.setCode(CodeMsg.C500);
            msg = CodeMsg.C500_MSG;
        }
        json.setData(msg + errCause);
        return json;
    }

    /**
     * 处理用户token和请求参数
     */
    @ModelAttribute("getToken")
    public void getToken(@RequestBody(required = false) String param, HttpServletRequest request) {
//        System.out.println(param);
        if (StringUtils.isNotBlank(param)){
        	request.setAttribute(Constant.PARAM, param);
        }
//        JSONObject jsonObject = JSON.parseObject(param);
//        if (jsonObject != null) {
//            Object o = jsonObject.get(Constant.TOKEN_NAME);
//            if (o != null) {
//            	String token = "e6f5f17534f74db89c1048f4d3888888";
//                /*String token = o.toString();
//                LoginUserInfo loginUserInfo = SSOContext.getLoginUserInfo(token);
//                if (loginUserInfo.isEmpty()) {
//                    throw new InvalidTokenException();
//                } else {
//                    request.setAttribute(Constant.CURRENT_USER_NAME, loginUserInfo);
//                }
//                request.setAttribute(Constant.TOKEN_NAME, token);*/
//            	request.setAttribute(Constant.TOKEN_NAME, token);
//                return token;
//            }
//        }
//        throw new NoTokenException();
    }

    /**
     * 表单提交日期绑定
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
