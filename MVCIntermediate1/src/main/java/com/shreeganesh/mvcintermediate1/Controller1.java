package com.shreeganesh.mvcintermediate1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller1 {

	@ResponseBody
	@RequestMapping("/ClinicHome")
	String getClinicHome()
	{
		return "Clinic Home";
	}
}
