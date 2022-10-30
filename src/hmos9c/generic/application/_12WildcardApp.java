package hmos9c.generic.application;

import hmos9c.generic._1MyData;

public class _12WildcardApp {
  public static void main(String[] args) {

    print(new _1MyData<Integer>(100));
    print(new _1MyData<String>("Sanas"));
    print(new _1MyData<_11MultipleConstraintApp.Manager>(new _11MultipleConstraintApp.Manager()));

  }

  public static void print(_1MyData<?> myData){
    System.out.println(myData.getData());
  }
}
