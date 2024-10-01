package chapter04;

public class Main26 {
  public static void main(String[] args) {
    Student student1 = new Student(); // constructor

    Student student2 = new Student("Uyen", 23); // cung cap gia tri ban dau
    System.out.println(student2.name + " " + student2.age);
  }
}
