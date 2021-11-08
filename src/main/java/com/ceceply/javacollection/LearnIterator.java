package com.ceceply.javacollection;

import java.util.Iterator;
import java.util.List;

public class LearnIterator {
  public static void main(String[] args) {
    
    Iterable<String> games = List.of("Minecraft", "Call of Duty", "Pro Evolution Soccer", "Geometry Dash");
    Iterator<String> iterator = games.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    
  }
}
