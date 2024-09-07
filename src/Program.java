import myEntity.Person;

public class Program {
  public static void main(String[] args) {
    System.out.println("Hello world");
    Person person = new Person("Jake");
    person.sayHello();

    System.out.println("Name: " + person.getName());
  }
}
