package com.easyfly.main;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * 注意，使用war方式部署，需要开启此类
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {
	  
    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApplicationMain.class);  
    }  
  
} 
