package com.codebq.customvalidator.constraint;

import com.codebq.customvalidator.interfaces.EnumMethods;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EnumListValidator implements ConstraintValidator<ValidEnumList, List<String>> {
  private List<String> enumValues;

  @Override
  public void initialize(ValidEnumList constraintAnnotation) {
    this.enumValues =  Arrays.stream(constraintAnnotation
        .enumClass()
        .getEnumConstants())
        .map(EnumMethods::getDay)
        .collect(Collectors.toList());
  }

  @Override
  public boolean isValid(List<String> values, ConstraintValidatorContext context) {
    if (values == null) {
      return true; // Null values are considered valid
    } else {
      values.removeAll(this.enumValues);
      return values.size() == 0;
    }
  }
}