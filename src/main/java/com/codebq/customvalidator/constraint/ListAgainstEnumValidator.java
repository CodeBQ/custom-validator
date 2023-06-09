package com.codebq.customvalidator.constraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListAgainstEnumValidator implements ConstraintValidator<ListAgainstEnumConstraint, List<String>> {

  private List<String> enumValues;

  @Override
  public void initialize(ListAgainstEnumConstraint constraintAnnotation) {
    enumValues = Arrays.stream(constraintAnnotation.enumClass().getEnumConstants()).map(Enum::name).collect(Collectors.toList());
  }

  @Override
  public boolean isValid(List<String> strings, ConstraintValidatorContext constraintValidatorContext)
  {
    return enumValues.containsAll(strings);
  }

}
