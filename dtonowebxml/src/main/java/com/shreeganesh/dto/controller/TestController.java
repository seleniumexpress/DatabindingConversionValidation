package com.shreeganesh.dto.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shreeganesh.dto.api.UserInfoDto;

@Controller
public class TestController {

	@ResponseBody
	@RequestMapping("/test")
	String test() {
		return "fatafat";
	}

	@RequestMapping("/homepageold")
	String gethomepageold(UserInfoDto userInfoDto,Model model) {
		model.addAttribute("userInfoDto", userInfoDto);
		return "home-page-old";
	}

	@RequestMapping("/process0")
	String getprocess0(HttpServletRequest httpServlet,Model model) {
		String yourName = httpServlet.getParameter("yourName");
		String crushName = httpServlet.getParameter("crushName");
		model.addAttribute("yourName", yourName);
		model.addAttribute("crushName", crushName);
		
		
		return "process";
	}
	
	@RequestMapping("/process")
	String getprocess(@RequestParam String yourName,@RequestParam String crushName,Model model) {
		
		model.addAttribute("yourName", yourName);
		model.addAttribute("crushName", crushName);
		
		
		return "process";
	}
	
	@RequestMapping("/processBest")
	String getprocess(UserInfoDto userInfoDto,Model model) {
		model.addAttribute("userInfoDto", userInfoDto);
		return "process1";
	}
	
	@RequestMapping("/")
	String gethome(@ModelAttribute("userInfoDto") UserInfoDto userInfoDto) {
		return "home-page";
	}
}
