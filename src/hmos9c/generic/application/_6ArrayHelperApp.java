package hmos9c.generic.application;

public class _6ArrayHelperApp {
  public static void main(String[] args) {

    String[] names = {"Sanas", "Febriyan"};
    Integer[] numbers = {1, 2, 3, 4, 5};

    System.out.println(
        hmos9c.generic.util._5ArrayHelper.<String>count(names)
    );

    System.out.println(
        hmos9c.generic.util._5ArrayHelper.count(numbers)
    );

  }
}
