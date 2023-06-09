package com.codebq.customvalidator.constraint;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Constraint(validatedBy = ListAgainstEnumValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ListAgainstEnumConstraint {
  Class<? extends Enum<?>> enumClass();
  String message() default "One or more list items are incorrect";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}
