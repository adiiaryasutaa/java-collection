package com.ceceply.javacollection.e_Set;

import java.util.EnumSet;

public class LearnEnumSet {
  
  public static enum Gender {
    MALE,
    FEMALE,
    NOT_MENTION
  }
  
  public static void main(String[] args) {
    
    EnumSet<Gender> genders = EnumSet.allOf(Gender.class);

    for (Gender gender : genders) {
      System.out.println(gender);
    }

  }
}
