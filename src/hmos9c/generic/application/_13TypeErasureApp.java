package hmos9c.generic.application;

import hmos9c.generic._1MyData;

public class _13TypeErasureApp {
  public static void main(String[] args) {

    _1MyData myData = new _1MyData("Sanas");

    _1MyData<Integer> integerMyData = (_1MyData<Integer>) myData;
    Integer integer = integerMyData.getData();

  }
}
