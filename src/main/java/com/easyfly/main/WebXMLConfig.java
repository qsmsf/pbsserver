package com.easyfly.main;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.szga.xinghuo.api.serviceregistry.EurekaClientInitListener;
@Configuration
public class WebXMLConfig {
//    @Bean
//    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
//        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean();
///*注：
//1、服务只能注册到一个注册中心。
//2、注册到Eureka注册中心的服务是不能调用注册到Zookeeper注册中心的服务。
//3、注册到Zookeeper注册中心的服务可以调用注册到Eureka注册中心的服务，通过http请求，
//*/
//        servletListenerRegistrationBean.setListener(new EurekaClientInitListener());
//        return servletListenerRegistrationBean;
//    }
}