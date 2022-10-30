package hmos9c.generic.application;

import hmos9c.generic._14Person;

import java.util.Arrays;

public class _15ComparableApp {
  public static void main(String[] args) {

    _14Person[] people = {
        new _14Person("Sanas", "Indonesia"),
        new _14Person("Akmal", "Indonesia"),
        new _14Person("Ardi", "Indonesia")
    };

    Arrays.sort(people);

    System.out.println(Arrays.toString(people));

  }
}
