package com.codebq.customvalidator.model;

import com.codebq.customvalidator.Constraint.ListAgainstEnumConstraint;
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
  @ListAgainstEnumConstraint
  private List<String> items;
}
