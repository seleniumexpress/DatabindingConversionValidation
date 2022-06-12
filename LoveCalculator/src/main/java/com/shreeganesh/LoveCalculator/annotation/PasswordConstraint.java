package com.shreeganesh.LoveCalculator.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraint implements ConstraintValidator<PasswordAnnotation, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		
		
		
		return false;
	}

}
