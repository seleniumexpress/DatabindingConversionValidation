package com.shreeganesh.LoveCalculator.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeConstraint implements ConstraintValidator<AgeAnnotation, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if(value<18 || value>60) {
			return false;
		}
		return true;
	}

	

	

}
