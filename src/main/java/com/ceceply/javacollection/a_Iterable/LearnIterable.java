package com.ceceply.javacollection.a_Iterable;

import java.util.List;

public class LearnIterable {
  public static void main(String[] args) {
    
    Iterable<String> games = List.of("Minecraft", "Call of Duty", "Pro Evolution Soccer", "Geometry Dash");

    for (String game : games) {
      System.out.println(game);
    }
    
  }
}
