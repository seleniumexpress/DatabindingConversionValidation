package com.shreeganesh.noxml3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.shreeganesh.noxml3.controller")
public class beansconfig {

	@Bean
	InternalResourceViewResolver it() {
		InternalResourceViewResolver ita = new InternalResourceViewResolver();
		ita.setSuffix(".jsp");
		ita.setPrefix("/WEB-INF/views/");
		return ita;
	}
	
}
