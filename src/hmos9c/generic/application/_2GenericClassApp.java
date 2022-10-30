package hmos9c.generic.application;

import hmos9c.generic._1MyData;

public class _2GenericClassApp {
  public static void main(String[] args) {

    _1MyData<String> stringMyData = new _1MyData<String>("Sanas");
    _1MyData<Integer> integerMyData = new _1MyData<Integer>(10);

    String stringValue = stringMyData.getData();
    Integer integerValue = integerMyData.getData();

    System.out.println(stringValue);
    System.out.println(integerValue);

  }
}
