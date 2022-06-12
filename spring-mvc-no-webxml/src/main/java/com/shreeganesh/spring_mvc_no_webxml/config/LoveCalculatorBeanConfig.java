package com.shreeganesh.spring_mvc_no_webxml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.shreeganesh.spring_mvc_no_webxml")
public class LoveCalculatorBeanConfig {

	@Bean
	public InternalResourceViewResolver it() {
		InternalResourceViewResolver ita =new InternalResourceViewResolver();
		ita.setPrefix("/WEB-INF/views/");
		ita.setSuffix(".jsp");
		
		return ita;
	}

}
