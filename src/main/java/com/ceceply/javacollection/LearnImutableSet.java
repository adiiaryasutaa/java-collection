package com.ceceply.javacollection;

import java.util.Set;

public class LearnImutableSet {
  public static void main(String[] args) {
    
    Set<String> programmingLanguages = Set.of("C++", "Java", "Python", "JavaScript", "PHP");

    programmingLanguages.add("C++");
    programmingLanguages.remove("PHP");
    /*
      Exception in thread "main" java.lang.UnsupportedOperationException
        at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
        at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
        at com.ceceply.javacollection.LearnImutableSet.main(LearnImutableSet.java:10)
    */

  }
}
