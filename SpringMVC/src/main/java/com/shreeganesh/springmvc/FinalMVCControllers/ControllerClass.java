package com.shreeganesh.springmvc.FinalMVCControllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {

	@RequestMapping("/Cafe")
	String getCafeHome() {
		return "CafeHome";
	}
	
	@RequestMapping("/orderplaced")
	String getOrderPlaced(HttpServletRequest request, Model model) {
		
		String Ordername = request.getParameter("Ordername");
		
		model.addAttribute("userInputOrdername", Ordername);
		return "orderplaced";
				
	}
	
}
