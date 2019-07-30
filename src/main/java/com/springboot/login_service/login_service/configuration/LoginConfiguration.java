package com.springboot.login_service.login_service.configuration;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableWebMvc
public class LoginConfiguration extends WebMvcConfigurationSupport {
	@Bean
	public Map<String, String> MapData() {
		Map<String, String> hasMap = new HashMap<String, String>();
		hasMap.put("Hi", "Welcome NyN ");
		return hasMap;
	}
	/*
	 * @Bean public InternalResourceViewResolver resolver() {
	 * InternalResourceViewResolver vr = new InternalResourceViewResolver();
	 * vr.setPrefix("/WEB-INF/jsp/"); vr.setSuffix(".jsp"); return vr; }
	 */

	
}
