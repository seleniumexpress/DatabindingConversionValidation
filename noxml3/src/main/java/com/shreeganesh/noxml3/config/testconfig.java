package com.shreeganesh.noxml3.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class testconfig // implements WebApplicationInitializer
{

	// @Override
	/*
	 * public void onStartup(ServletContext servletContext) throws ServletException
	 * { // TODO Auto-generated method stub
	 * 
	 * //create webapplication contex
	 * 
	 * 
	 * XmlWebApplicationContext context = new XmlWebApplicationContext();
	 * context.setConfigLocation("classpath:beans.xml");
	 * 
	 * 
	 * AnnotationConfigWebApplicationContext context = new
	 * AnnotationConfigWebApplicationContext(); context.register(beansconfig.class);
	 * 
	 * //pass to dispatcher servlet during creation DispatcherServlet ds = new
	 * DispatcherServlet(context);
	 * 
	 * 
	 * //add to servlet context ServletRegistration.Dynamic srd=
	 * servletContext.addServlet("Bhaihojaaabb", ds); srd.addMapping("/clinic/*");
	 * srd.setLoadOnStartup(1);
	 * 
	 * }
	 */

}
