package com.codebq.customvalidator.enums;

public enum Vasyas {

  VASYA("Vasya", "M"),
  VASILY("Vasily", "M"),
  VASILISA("Vasilisa", "F");

  public final String name;
  public final String gender;

  Vasyas(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }
}
