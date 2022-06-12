package com.shreeganesh.dto.api;

public class UserInfoDto {

	private String yourName="Krishna";
	private String crushName="Swapnali";
	public String getYourName() {
		return yourName;
	}
	public void setYourName(String yourName) {
		this.yourName = yourName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "UserInfoDto [yourName=" + yourName + ", crushName=" + crushName + "]";
	}
	
	
}
