package com.shreeganesh.LoveCalculator.api;

import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDto {
	
	@NotBlank(message = "* Name should not be blank")
	@Size(min = 8,max = 15,message = "* Name should be between 8-15 characters")
	private String name;
	@NotBlank(message = "* User Name should not be blank")
	@Size(min = 8,max = 15,message = "* User Name should be between 8-15 characters")
	private String userName;
	@NotBlank(message = "* Password should not be blank")
	@Size(min = 8,max = 15,message = "* Password should be between 8-15 characters")
	private String password;
	@NotBlank(message = "* Country cannot be blank")
	private String country;
	private String hobby;
	@NotBlank(message = "* Gender cannot be blank")
	private String gender;
	@AssertTrue(message = "* Accept the Terms and Conditions before Registering")
	private boolean terms=false;
	@Valid
	private CommunicationDto commdto;
	
	

	public CommunicationDto getCommdto() {
		return commdto;
	}
	public void setCommdto(CommunicationDto commdto) {
		this.commdto = commdto;
	}
	public String getGender() {
		return gender;
	}
	public boolean isTerms() {
		return terms;
	}
	public void setTerms(boolean terms) {
		this.terms = terms;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
