package com.shreeganesh.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sister")
public class SisterController {

	@ResponseBody
	@RequestMapping("/makeup")
	String getMakeUp() {
		return "le le ..... but theek se use karna mehenga hai ..!!!"; 
	}
	
	
	
	@RequestMapping("/homework")
	String getHelpInHomeWork() {
		return "/WEB-INF/views/homework.jsp";
	}
	
	@RequestMapping("/gift")
	String getGift() {
		return "Giftsss";
	}
}
