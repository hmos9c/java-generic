package hmos9c.generic.application;

import hmos9c.generic._3Pair;

public class _4PairApp {
  public static void main(String[] args) {

    _3Pair<String, Integer> pair = new _3Pair<String, Integer>("Sanas", 100);
    System.out.println(pair.getFirst());
    System.out.println(pair.getSecond());

  }
}
