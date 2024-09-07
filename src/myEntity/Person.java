package myEntity;

public class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  public void sayHello() {
    System.out.println("Hello! I am " + name);
  }

  public String getName() {
    return name;
  }
}
