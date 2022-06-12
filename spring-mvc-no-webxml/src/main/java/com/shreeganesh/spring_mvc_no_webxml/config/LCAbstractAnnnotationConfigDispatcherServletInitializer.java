package com.shreeganesh.spring_mvc_no_webxml.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LCAbstractAnnnotationConfigDispatcherServletInitializer
		extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr[]= {LoveCalculatorBeanConfig.class};
		
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		
		String arr[] = {"/home/*"} ;
		
		return arr;
	}

}
