package com.shreeganesh.LoveCalculator.formatter;

import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

import com.shreeganesh.LoveCalculator.api.PhoneDto;


public class PhoneFormatter implements Formatter<PhoneDto> {

	@Override
	public String print(PhoneDto object, Locale locale) {
		
		System.out.println("test inside priont");
		
		return object.toString();
	}

	@Override
	public PhoneDto parse(String text, Locale locale) throws ParseException {
		
		System.out.println("Formating test before binding data for process page");
		PhoneDto p =new PhoneDto();
		String arr[]=text.split("-");
		p.setCountrycode(arr[0]);
		p.setNumber(arr[1]);
		return p;
	}

}
