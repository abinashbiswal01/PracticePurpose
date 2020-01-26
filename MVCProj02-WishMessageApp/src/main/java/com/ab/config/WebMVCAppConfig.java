package com.ab.config;

import java.util.Properties;

import javax.lang.model.element.Parameterizable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

@Configuration
@ComponentScan(basePackages="com.ab.controller")
public class WebMVCAppConfig {

	@Bean
	public SimpleUrlHandlerMapping createSUHM() {
		SimpleUrlHandlerMapping mapping=null;
		Properties props=null;
		
		mapping= new SimpleUrlHandlerMapping();
		props=new Properties();
		props.put("/home.htm", "pvc");
		mapping.setMappings(props);
		mapping.setOrder(10);      //to overDominate other autoConfig HandlerMappings 
		return mapping;
		
	}
	
	@Bean("pvc")
	public ParameterizableViewController createPVC() {
		ParameterizableViewController pvc=null;
		
		pvc=new ParameterizableViewController();
		pvc.setViewName("welcome");
		return pvc;
		
	}
	
}
