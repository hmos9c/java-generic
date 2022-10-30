package hmos9c.generic.application;

import hmos9c.generic._14Person;

import java.util.Arrays;
import java.util.Comparator;

public class _16ComparatorApp {
  public static void main(String[] args) {

    _14Person[] people = {
        new _14Person("Sanas", "Indonesia"),
        new _14Person("Akmal", "Indonesia"),
        new _14Person("Ardi", "Indonesia")
    };

    Comparator<_14Person> comparator = new Comparator<_14Person>() {
      @Override
      public int compare(_14Person o1, _14Person o2) {
        return o1.getName().compareTo(o2.getName());
      }
    };

    Arrays.sort(people, comparator);

    System.out.println(Arrays.toString(people));
  }
}
