package com.ceceply.javacollection.c_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class LearnCollection {
  public static void main(String[] args) {
    
    Collection<Integer> values = new ArrayList<>();

    // === Add data ===

    values.add(100);
    values.add(80);
    values.add(95);

    values.addAll(Arrays.asList(75, 60, 100, 90));

    for (Integer value : values) {
      System.out.println(value);
    }

    // === Remove data ===

    values.remove(60);

    values.removeAll(Arrays.asList(90, 75));

    System.out.println();
    for (Integer value : values) {
      System.out.println(value);
    }

    // === Check data ===

    System.out.println();
    System.out.println(values.contains(100));
    System.out.println(values.containsAll(Arrays.asList(70, 40)));

  }
}
