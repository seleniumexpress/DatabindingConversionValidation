package com.shreeganesh.LoveCalculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.shreeganesh.LoveCalculator.formatter.CurrencyFormatter;
import com.shreeganesh.LoveCalculator.formatter.PhoneFormatter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.shreeganesh.LoveCalculator.controller")
public class beansconfig implements WebMvcConfigurer{

	@Bean
	InternalResourceViewResolver it() {
		
		InternalResourceViewResolver ita = new InternalResourceViewResolver();
		ita.setPrefix("/WEB-INF/views/");
		ita.setSuffix(".jsp");
		return ita;
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("Setting Formatter before initialization of ds in beans config");
		registry.addFormatter(new PhoneFormatter());
		registry.addFormatter(new CurrencyFormatter());
	}
}
