package com.easyfly.main.sso;

import cn.gov.szga.sso.bean.LoginInfo;
import cn.gov.szga.sso.servlet.SingleSignOnServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySSOLoginServlet extends SingleSignOnServlet {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	protected void storeAuthenticationState(HttpServletRequest paramHttpServletRequest,
                                            HttpServletResponse paramHttpServletResponse, LoginInfo usero) {
		logger.info("login success");
			System.out.println("success!");
			 //TODO 编写自己的登录逻辑，如：
			  //其中usero为已登录用户信息

	}

	
	 @Override
	    protected void onFailSignIn(HttpServletRequest req, HttpServletResponse response)
	    {
		//自定义登录失败逻辑
			logger.info("login failed");
	        super.onFailSignIn(req, response);
	    }
	    
	    @Override
	    protected void onSuccessLogout(HttpServletRequest req, HttpServletResponse response){
	    	//自定义注销逻辑
	    	super.onSuccessLogout(req, response);
	    }
	
}
