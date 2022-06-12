package com.shreeganesh.LoveCalculator.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class signInUserInfoDto {
	
	
	@NotBlank(message = "* User Name should not be blank")
	@Size(min = 8,max = 15,message = "* User Name should be between 8-15 characters")
	private String userName;
	@NotBlank(message = "* User Name should not be blank")
	@Size(min = 8,max = 15,message = "* User Name should be between 8-15 characters")private String password;
	@AssertTrue(message = "* Accept the Terms and Conditions before Signing In")
	private boolean terms=false;
	

	public boolean isTerms() {
		return terms;
	}
	public void setTerms(boolean terms) {
		this.terms = terms;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
