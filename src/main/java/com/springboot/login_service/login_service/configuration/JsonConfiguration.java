package com.springboot.login_service.login_service.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
public class JsonConfiguration {
@Bean
public org.springframework.web.servlet.View jsonTemplate(){
	
	 MappingJackson2JsonView view = new MappingJackson2JsonView();
     view.setPrettyPrint(true);
	return view;
}
@Bean
public ViewResolver viewResolver() {
    return new BeanNameViewResolver();
}
}
