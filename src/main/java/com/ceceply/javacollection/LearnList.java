package com.ceceply.javacollection;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
  public static void main(String[] args) {
    
    List<String> names = new ArrayList<>();

    names.add("Cecep");
    names.add("Kara");
    names.add("Dinda");

    names.set(0, "Adi");

    System.out.println(names.get(0));
    System.out.println(names.get(1));

  }
}
