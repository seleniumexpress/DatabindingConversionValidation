package com.shreeganesh.LoveCalculator.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shreeganesh.LoveCalculator.api.CheckoutDto;
import com.shreeganesh.LoveCalculator.api.CommunicationDto;
import com.shreeganesh.LoveCalculator.api.PhoneDto;
import com.shreeganesh.LoveCalculator.api.UserInfoDto;
import com.shreeganesh.LoveCalculator.api.signInUserInfoDto;

@Controller
public class TestController {

	@RequestMapping("/test")
	String gettest() {
		return "redirect";
	}
	
	@RequestMapping("/")
	String gethome() {
		return "redirect";
	}
	
	@RequestMapping("/register")
	String gethome(@ModelAttribute("userInfoDto") UserInfoDto dto) {
		
		PhoneDto p=new PhoneDto();
		p.setCountrycode("91");
		p.setNumber("9988776655");
		CommunicationDto d = new CommunicationDto();
		d.setPhone(p);
		dto.setCommdto(d);
		return "register";
	}
	
	@RequestMapping("/register-process")
	String getregisterprocess(@Valid @ModelAttribute("userInfoDto") UserInfoDto InfoDto, BindingResult br) {
		
		if(br.hasErrors()) {
			System.out.println(br);
			return "register";
		}
	
			return "process";
	}
	
	@RequestMapping("/signIn-process")
	String getsigninprocess(@Valid @ModelAttribute("signInUserInfoDto") signInUserInfoDto InfoDto, BindingResult br) {
		
		if(br.hasErrors()) {
			return "sign-in";
		}
	
			return "process";
	}
	
	@RequestMapping("/sign-in")
	String getsignin(@ModelAttribute("signInUserInfoDto") signInUserInfoDto dto) {
		return "sign-in";
	}
	
	@RequestMapping("/checkout")
	String getCheckout(@ModelAttribute("checkoutdto") CheckoutDto checkoutDto) {
		
		return "checkout";
	}
	
	@RequestMapping("/checkout-output")
	String getCheckoutOutput(@Valid @ModelAttribute("checkoutdto") CheckoutDto Dto, BindingResult br) {
		
		if(br.hasErrors()) {
			System.out.println(br.getAllErrors());
			
			return "checkout";}
		
		return "checkout-output";
	}
}
