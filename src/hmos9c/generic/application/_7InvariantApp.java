package hmos9c.generic.application;

import hmos9c.generic._1MyData;

public class _7InvariantApp {
  public static void main(String[] args) {

    _1MyData<String> stringMyData = new _1MyData<>("Sanas");
    // doIt(stringMyData); // ERROR
    // MyData<Object> objectMyData = stringMyData; // ERROR

    _1MyData<Object> objectMyData = new _1MyData<>(1000);
    // MyData<Integer> integerMyData = objectMyData; // ERROR
    // doItInteger(objectMyData);
  }

  public static void doIt(_1MyData<Object> objectMyData){
    // do nothing
  }

  public static void doItInteger(_1MyData<Integer> integerMyData){
    // do nothing
  }
}
