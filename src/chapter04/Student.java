package chapter04;

public class Student {
  // Class Attributes
  private String name;
  private int age;

  // Constructor
  public Student() {
  }

  public Student(String name1, int age1) {
    // this:
    this.name = name1;
    this.age = age1;
  }

  // Getter & Setter
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name1) {
    this.name = name1;
  }

  public void setAge(int age1) {
    this.age = age1;
  }

  // Class Method
  void learnJava() {
    System.out.println("Learn Java with Youtube");
  }

}
