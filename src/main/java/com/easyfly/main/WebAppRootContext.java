package com.easyfly.main;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.util.WebAppRootListener;
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class WebAppRootContext implements ServletContextInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addListener(WebAppRootListener.class);
/*
* 服务名称
*/
        servletContext.setInitParameter("servicesName", "pbsserver");
/*
* 服务ID
*/
        servletContext.setInitParameter("serviceID", "cbb3e42a939c4b0c8f9c0f213637e273");
/*
* 服务端口(注：默认是8080)
*/
        servletContext.setInitParameter("serverPort", "8082");
/*
* 服务密钥
*/
        servletContext.setInitParameter("secretKey", "1c1b9b9f1793e5ee31efa6f964be9edb");
/*
* 网络环境的切换:JMT 移动专网,SZGAW 公安网,默认是公安网SZGAW
*/
        servletContext.setInitParameter("networkMode", "SZGAW");
/*
* 运行模式:dev 开发模式,prod 生产模式,test 测试模式,默认是测试模式 test
*/
        servletContext.setInitParameter("operationMode", "prod");
    }
}
