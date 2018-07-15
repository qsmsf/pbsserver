package com.easyfly.main;

import com.szga.xinghuo.api.base.zipkin.ZipkinFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZipkinFilterConfig {
    @Bean
    public FilterRegistrationBean chkFilterRegistration(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new ZipkinFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }
}
