package com.shreeganesh.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {

	@ResponseBody
	@RequestMapping("/sugar")
	String getSugar() {
		return "Theek hai ..... Yeh le tera 2kg shakkar udhari"; 
	}
}
