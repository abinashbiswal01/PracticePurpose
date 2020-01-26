package com.ab.initializer;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.ab.config.RootAppConfig;
import com.ab.config.WebMVCAppConfig;
import com.ab.test.MvcProj02WishMessageAppApplication;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MvcProj02WishMessageAppApplication.class,WebMVCAppConfig.class,RootAppConfig.class);
	}

}
