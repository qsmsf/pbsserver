package com.easyfly.main.base.controller;

import com.alibaba.fastjson.JSONObject;
//import com.xinghuo.core.common.model.json.DataGridReturn;
import com.easyfly.main.util.Constant;
import com.easyfly.main.util.JSONUtil;
import com.easyfly.main.util.ReturnJSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * Controller基类，适用当前应用场景：前后端分离，集成SSO，前端请求参数为JSON字符串形式（requestbody）
 */
public class BaseController {
    @Autowired
    protected HttpServletRequest request;
    protected String APPCODE="123456";

    protected static final Logger logger = LoggerFactory.getLogger("BaseController");

    /**
     * 得到当前请求用户的基本信息
     */
//    public LoginUserInfo getCurrentUser() {
//        return (LoginUserInfo) request.getAttribute(Constant.CURRENT_USER_NAME);
//    }

    /**
     * 得到当前请求用户的基本信息
     */
    public Integer getCurrentUserId() {
        //TODO 因ID类型正在从String转Integer，暂写死
//        return Integer.valueOf(((LoginUserInfo) request.getAttribute(Constant.CURRENT_USER_NAME)).getId());
        return 4864620;
    }

    /**
     * 得到当前请求的请求参数
     */
    public String getParam() {
    	return (String) request.getAttribute(Constant.PARAM);
    }

    public String getHeader(String param){
        return request.getHeader(param);
    }

    public String getParameter(String param){
        return request.getParameter(param);
    }
    /**
     * 得到当前请求的请求参数，返回转换后的JSONObject
     */
    public JSONObject getParamInJSON() {
        return JSONUtil.parseObject(getParam());
    }

    /**
     * 得到当前请求的请求参数，返回转换为指定类型的对象
     */
    public <T> T getParamInJSON(Class<T> clazz) {
        return JSONUtil.parseObject(getParam(), clazz);
    }

    public <T> T getHeaderInJSON(Class<T> clazz,String param) {
        return JSONUtil.parseObject(getHeader(param), clazz);
    }

    /**
     * 获取设置好cmd参数的ReturnJson对象
     */
    public ReturnJSON getReturnJson() {
        ReturnJSON json = new ReturnJSON();
        json.setCmd(request.getRequestURI());
        return json;
    }

    /**
     * 设置接口返回的JSON值
     *
     * @param data 返回数据
     * @param code 错误码
     */
    public ReturnJSON setReturnJson(Object data, Integer... code) {
        ReturnJSON json = new ReturnJSON();
        json.setCmd(request.getRequestURI());
        if (code != null && code.length > 0)
            json.setCode(code[0]);
        if (data != null)
            json.setData(data);
        return json;
    }

    /**
     * 设置分页查询接口返回的JSON值
     *
     * @param pageNum 页码
     */
//    public ReturnJSON setReturnJson(DataGridReturn dataGridReturn, Integer pageNum) {
//        ReturnJSON json = new ReturnJSON();
//        json.setCmd(request.getRequestURI());
//        if (dataGridReturn != null) {
//            dataGridReturn.setMessage(pageNum + "");
//            json.setData(dataGridReturn);
//        }
//        return json;
//    }
}
