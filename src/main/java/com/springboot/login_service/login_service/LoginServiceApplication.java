package com.springboot.login_service.login_service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@Configuration
@SpringBootApplication
//@EntityScan("com.springboot.login_service.login_service.jpa.entity")
@EntityScan("com.springboot.login_service.login_service.entity")
@ComponentScan(basePackages = { "com.springboot.login_service.login_service" })
public class LoginServiceApplication extends SpringBootServletInitializer {
	private static Logger logger = LoggerFactory.getLogger(LoginServiceApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LoginServiceApplication.class);
	}

	public static void main(String[] args) {
		logger.info("starting main method of loginserviceapplicatoin class");
		SpringApplication.run(LoginServiceApplication.class, args);
		logger.info("end of  main method of loginserviceapplicatoin class ");
	}

}
