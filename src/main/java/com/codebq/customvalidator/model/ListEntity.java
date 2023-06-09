package com.codebq.customvalidator.model;

import com.codebq.customvalidator.constraint.ListAgainstEnumConstraint;
import com.codebq.customvalidator.constraint.ValidEnumList;
import com.codebq.customvalidator.enums.Names2;
import com.codebq.customvalidator.enums.Names1;
import com.codebq.customvalidator.enums.WeekDays;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListEntity {

  @NotNull
  private UUID id;

  @NotNull
  @ListAgainstEnumConstraint(enumClass = Names1.class)
  private List<String> items;

  @NotNull
  @ListAgainstEnumConstraint(enumClass = Names2.class)
  private List<String> petyas;

  @ValidEnumList(enumClass = WeekDays.class)
  private List<String> weekDays;
}
