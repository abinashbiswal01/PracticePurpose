package com.ab.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ab.dao.LoginDAOImpl;

@Configuration
@ComponentScan(basePackages="com.ab.service")
public class ServiceConfig {
	
}
