package com.codebq.customvalidator.Constraint;

import com.codebq.customvalidator.enums.Vasyas;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListAgainstEnumValidator implements ConstraintValidator<ListAgainstEnumConstraint, List<String>> {

  private List<String> enumValues;

  @Override
  public void initialize(ListAgainstEnumConstraint constraintAnnotation) {
    enumValues = Stream.of(constraintAnnotation.enumClass().getEnumConstants())
        .map(e -> en)
  }

  @Override
  public boolean isValid(List<String> strings, ConstraintValidatorContext constraintValidatorContext)
  {
    return strings.stream().allMatch(this::stringExists);
  }

  private Boolean stringExists(String name) {
    return Arrays.stream(Vasyas.values()).anyMatch(string -> string.name.equals(name));
  }

}
