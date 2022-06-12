package com.shreeganesh.spring_mvc_no_webxml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/testing")
	String testing() {
		return "hello-world";
	}
	
	@RequestMapping("")
	String test() {
		return "hello-world";
	}
	
	@RequestMapping("/")
	String tester() {
		return "hello-world";
	}
}
