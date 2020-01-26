package com.ab.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.ab.config.RootAppConfig;
import com.ab.config.WebMVCConfig;
@SpringBootApplication
@Import({RootAppConfig.class,WebMVCConfig.class})
public class MvcProj03LoginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcProj03LoginAppApplication.class, args);
	}
}
