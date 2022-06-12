package com.shreeganesh.dto.config;



  import org.springframework.web.servlet.support.
  AbstractAnnotationConfigDispatcherServletInitializer;
  
  public class deploymentdescriptor extends
  AbstractAnnotationConfigDispatcherServletInitializer {
  
  @Override protected Class<?>[] getRootConfigClasses() { // TODO
  return null; }
  
  @Override protected Class<?>[] getServletConfigClasses() { // TODO
  Class arr[] = {beansconfig.class};
  System.out.println("idhar agaya"); return arr; }
  
  @Override protected String[] getServletMappings() { 
	  String arr[]= {"/"}; System.out.println("aur idhar bhi");
  return arr; }
  
  }
 

	

