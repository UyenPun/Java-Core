package chapter04;

public class Main28 {
  public static void main(String[] args) {
    Student student1 = new Student(); // constructor

    Student student2 = new Student("Uyen", 23); // cung cap gia tri ban dau

    student2.setName("BaiLu"); // cập nhật value name
    student2.setAge(25); // cập nhật value age

    System.out.println(student2.getName() + " " + student2.getAge());
  }
}
