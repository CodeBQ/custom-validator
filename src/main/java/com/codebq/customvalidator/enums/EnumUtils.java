package com.codebq.customvalidator.enums;

import com.codebq.customvalidator.interfaces.EnumMethods;

public class EnumUtils {
  public static <T extends Enum<T> & EnumMethods> T[] getEnums(Class<T> enum1) {
    return enum1.getEnumConstants();
  }

}
