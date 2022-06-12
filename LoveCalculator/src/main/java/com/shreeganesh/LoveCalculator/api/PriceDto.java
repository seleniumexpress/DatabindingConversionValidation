package com.shreeganesh.LoveCalculator.api;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class PriceDto {
	
	@NotBlank
	@Size(min = 3,max=3)
	private String currency;
	@NotNull
	@NotBlank
	@Digits(fraction = 0, integer = 5)
	private String amount;
	@Override
	public String toString() {
		return currency+" "+ amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	
}
