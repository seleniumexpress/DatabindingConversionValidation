package com.shreeganesh.LoveCalculator.api;


public class PhoneDto {
	//@Size(max = 3,min = 1,message = "Invalid Country Code")
	private String countrycode;
	//@Size(max = 10,min = 10,message = "Invalid Number")
	private String number;
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return countrycode + "-" + number;
	}
	
	

}
