package com.shreeganesh.noxml3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testcontroller {


	@RequestMapping("/test")
	String testing() {
		return "welcome";
	}
}
