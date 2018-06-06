package com.easyfly.main.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 跨域处理
 * @author bai
 */
@Configuration
public class CrossDomain extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("POST")
				.allowCredentials(false); // 是否允许发送Cookie
//				.maxAge(86400); // 指定本次请求的有效期，单位秒，24小时
	}
	
}
