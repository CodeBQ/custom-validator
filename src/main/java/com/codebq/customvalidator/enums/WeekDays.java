package com.codebq.customvalidator.enums;

import com.codebq.customvalidator.interfaces.EnumMethods;

public enum WeekDays implements EnumMethods {
  MON("Monday"),
  TU("Tuesday");

  private String day;

  WeekDays(String day) {
    this.day = day;
  }

  @Override
  public String getDay() {
    return this.day;
  }
}
