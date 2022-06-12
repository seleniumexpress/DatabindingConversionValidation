package com.shreeganesh.LoveCalculator.api;

import javax.validation.constraints.Email;

public class CommunicationDto {
	
	
	@Email(message = "Invalid Email")
	private String email;
	//@Valid
	private PhoneDto phone;

	public PhoneDto getPhone() {
		return phone;
	}

	public void setPhone(PhoneDto phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
