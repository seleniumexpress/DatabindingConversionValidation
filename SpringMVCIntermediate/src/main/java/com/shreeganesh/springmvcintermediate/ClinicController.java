package com.shreeganesh.springmvcintermediate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClinicController {

	
	@RequestMapping("/clinichome")
	String getClinicHome() {
		return "ClinicHome";
	}
}
