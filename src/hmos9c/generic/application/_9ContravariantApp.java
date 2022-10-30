package hmos9c.generic.application;

import hmos9c.generic._1MyData;

public class _9ContravariantApp {
  public static void main(String[] args) {

    _1MyData<Object> objectMyData = new _1MyData<>("Sanas");
    objectMyData.setData(1000);

    _1MyData<? super String> myData = objectMyData;

    process(objectMyData);

    System.out.println(objectMyData.getData());
  }

  public static void process(_1MyData<? super String> myData){
    Object value = myData.getData();
    System.out.println("Process parameter " + value);

    myData.setData("Sanas Febriyan");
  }
}
