package com.codebq.customvalidator.model;

import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class ListEntity {

  @NotNull
  private UUID id;

  @NotNull
  private List<String> items;
}
