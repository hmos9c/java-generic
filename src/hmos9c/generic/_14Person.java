package hmos9c.generic;

public class _14Person implements Comparable<_14Person> {

  private String name;
  private String address;

  public _14Person(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public int compareTo(_14Person o) {
    return this.name.compareTo(o.name);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        '}';
  }
}
