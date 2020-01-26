package com.ab.initializer;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.ab.config.WebMVCConfig;
import com.ab.test.MvcProj03LoginAppApplication;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MvcProj03LoginAppApplication.class,WebMVCConfig.class);
	}

}
