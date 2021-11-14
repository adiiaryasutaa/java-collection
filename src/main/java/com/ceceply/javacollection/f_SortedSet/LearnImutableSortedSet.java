package com.ceceply.javacollection.f_SortedSet;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class LearnImutableSortedSet {
  public static void main(String[] args) {

    SortedSet<Game> gamesSet = new TreeSet<>(new GameComparator());

    gamesSet.add(new Game("Minecraft"));
    gamesSet.add(new Game("Genshin Impact"));
    gamesSet.add(new Game("Genshin Impact"));
    gamesSet.add(new Game("Call of Duty"));
    
    SortedSet<Game> imutableGameSet = Collections.unmodifiableSortedSet(gamesSet);

    imutableGameSet.add(new Game("Valorant"));
    /*
      Exception in thread "main" java.lang.UnsupportedOperationException
        at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        at com.ceceply.javacollection.LearnImutableSortedSet.main(LearnImutableSortedSet.java:19)
    */

  }
}
