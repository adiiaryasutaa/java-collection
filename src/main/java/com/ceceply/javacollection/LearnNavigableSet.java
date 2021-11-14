package com.ceceply.javacollection;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class LearnNavigableSet {
  public static void main(String[] args) {
    
    NavigableSet<String> mobileApps = new TreeSet<>();
    mobileApps.addAll(Arrays.asList("Instagram", "Twitter", "facebook", "Tumblr"));

    NavigableSet<String> mobileAppsDesc = mobileApps.descendingSet();
    NavigableSet<String> instagram = mobileApps.headSet("Instagram", true);

    for (var e : mobileApps) {
      System.out.println(e);
    }

    System.out.println();
    
    for (var e : mobileAppsDesc) {
      System.out.println(e);
    }

    System.out.println();

    for (var e : instagram) {
      System.out.println(e);
    }

    // Immutable Navigable Set: Collections.unmodifiableNavigableSet(set)

  }
}
