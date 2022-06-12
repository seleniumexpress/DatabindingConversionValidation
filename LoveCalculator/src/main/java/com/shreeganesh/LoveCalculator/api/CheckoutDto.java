package com.shreeganesh.LoveCalculator.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.CreditCardNumber;

import com.shreeganesh.LoveCalculator.annotation.AgeAnnotation;
public class CheckoutDto {

	@CreditCardNumber(ignoreNonDigitCharacters = true)
	private String creditcard;
	private PriceDto price;
	@AgeAnnotation(max = 45,min = 18)
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}

	public PriceDto getPrice() {
		return price;
	}

	public void setPrice(PriceDto price) {
		this.price = price;
	}

}
