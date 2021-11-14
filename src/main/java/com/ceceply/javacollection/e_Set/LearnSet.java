package com.ceceply.javacollection.e_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {
  public static void main(String[] args) {
    
    Set<String> groups = new HashSet<>();

    groups.add("XIRPL1");
    groups.add("XIRPL2");
    groups.add("XIMM1");
    groups.add("XIMM2");
    groups.add("XIMM3");
    groups.add("XITKJ1");
    groups.add("XITKJ2");

    groups.add("XIRPL1");

    for (String group : groups) {
      System.out.println(group);
    }

    Set<String> linkedGroups = new LinkedHashSet<>();

    linkedGroups.add("XIRPL1");
    linkedGroups.add("XIRPL2");
    linkedGroups.add("XIMM1");
    linkedGroups.add("XIMM2");
    linkedGroups.add("XIMM3");
    linkedGroups.add("XITKJ1");
    linkedGroups.add("XITKJ2");

    linkedGroups.add("XIRPL1");

    System.out.println();
    for (String group : linkedGroups) {
      System.out.println(group);
    }

  }
}
