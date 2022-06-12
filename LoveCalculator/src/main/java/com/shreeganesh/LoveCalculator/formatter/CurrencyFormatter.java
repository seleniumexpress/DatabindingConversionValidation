package com.shreeganesh.LoveCalculator.formatter;

import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.shreeganesh.LoveCalculator.api.PriceDto;

public class CurrencyFormatter implements Formatter<PriceDto> {

	@Override
	public String print(PriceDto object, Locale locale) {
		// TODO Auto-generated method stub
		return object.getCurrency()+" "+object.getAmount();
	}

	@Override
	public PriceDto parse(String text, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		String arr[]=text.split(" ");
		PriceDto priceDto=new PriceDto();
		int index=text.indexOf(" ");
		if(index==-1) {
			Currency c = Currency.getInstance("USD");
			priceDto.setCurrency(c.getSymbol());
			//priceDto.setCurrency("");
			priceDto.setAmount(arr[0]);
			
		}
		else
			{
		Currency c = Currency.getInstance(arr[1]);
			priceDto.setAmount(arr[0]);
			//priceDto.setCurrency(arr[1]);
			priceDto.setCurrency(c.getSymbol());
			}
		return priceDto;
	}

}
