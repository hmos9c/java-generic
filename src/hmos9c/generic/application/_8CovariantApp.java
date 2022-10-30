package hmos9c.generic.application;

import hmos9c.generic._1MyData;

public class _8CovariantApp {
  public static void main(String[] args) {

    _1MyData<String> stringMyData = new _1MyData<>("Sanas");
    process(stringMyData);

    _1MyData<? extends Object> myData = stringMyData;
  }

  public static void process(_1MyData<? extends Object> myData){
    System.out.println(myData.getData());

    // myData.setData(1); tidak boleh, karena berbahaya
  }
}
