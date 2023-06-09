package com.codebq.customvalidator.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Vasyas implements NeedNames {

  VASYA("Vasya", "M"),
  VASILY("Vasily", "M"),
  VASILISA("Vasilisa", "F");

  public final String name;
  public final String gender;

  Vasyas(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  @Override
  public List<String> getMyNames() {
    return  Arrays.stream(Vasyas.values()).map(v->v.name).collect(Collectors.toList());
  }
}
