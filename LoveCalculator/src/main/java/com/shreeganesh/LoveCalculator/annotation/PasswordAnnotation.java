package com.shreeganesh.LoveCalculator.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = PasswordConstraint.class)
public @interface PasswordAnnotation {
	
	String message() default "Password should contain 1 uppercase, 1 lowercase, 1 special character and 1 number";
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
