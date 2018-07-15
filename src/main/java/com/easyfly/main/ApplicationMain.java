package com.easyfly.main;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import javax.servlet.MultipartConfigElement;

@MapperScan("com.easyfly.main.dao")
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@EnableTransactionManagement
@EnableCircuitBreaker
@EnableAsync
public class ApplicationMain extends SpringBootServletInitializer {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
    }


	@Bean
    RestTemplate restTemplate() {
		return new RestTemplate();
	}


	/**
	 * 初始化kafka 通道
	 * @return
	 * @throws Exception
	 */
	/*
	@Bean
	public InitKafkaProducer myInitKafka() throws Exception {
		return new InitKafkaProducer();
	}
	*/
	/**
	 * filter
	 * @return
	 */

//	@Bean
//	public FilterRegistrationBean chkFilterRegistration(){
//		FilterRegistrationBean bean = new FilterRegistrationBean();
//		logger.trace("**FilterRegistrationBean**");
//		bean.setFilter(new SecurityFilter());
//		bean.addUrlPatterns("/*");
//		bean.addInitParameter("ignorePath", "/ssoclient/*|/images/*|/themes/*|*.csa2s|*.js|*.png|*.jpg|*.gif|*.bmp|/common/*");
//		bean.addInitParameter("ssoBaseEndpoint", "http://172.19.255.66:80/sso");
//		bean.addInitParameter("clientSecret", "1c1b9b9f1793e5ee31efa6f964be9edb");
////		bean.setOrder(1);
//		System.out.println("---------->");
//		return bean;
//	}

	/**
	 * servlet
	 * @return
	 */

	/**
	 * 文件上传配置
	 * @return
	 */
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		//文件最大
		factory.setMaxFileSize("102400KB"); //KB,MB
		/// 设置总上传数据总大小
		factory.setMaxRequestSize("204800KB");
		return factory.createMultipartConfig();
	}


}
