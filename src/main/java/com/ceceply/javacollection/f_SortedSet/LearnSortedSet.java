package com.ceceply.javacollection.f_SortedSet;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

class Game {
  private String name;
  
  Game(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}

class GameComparator implements Comparator<Game> {

  @Override
  public int compare(Game o1, Game o2) {
    return o1.getName().compareTo(o2.getName());
  }

}

public class LearnSortedSet {
  public static void main(String[] args) {
    
    SortedSet<Game> gamesSet = new TreeSet<>(new GameComparator());

    gamesSet.add(new Game("Minecraft"));
    gamesSet.add(new Game("Genshin Impact"));
    gamesSet.add(new Game("Genshin Impact"));
    gamesSet.add(new Game("Call of Duty"));

    for (Game game : gamesSet) {
      System.out.println(game.getName());
    }
  }
}
