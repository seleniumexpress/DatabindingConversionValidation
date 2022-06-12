package com.shreeganesh.LoveCalculator.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {AgeConstraint.class})
public @interface AgeAnnotation {
	
	int min() default 18;
	int max() default 60;
	String message() default "Invalid, Age should be in the range {min}-{max}";
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
