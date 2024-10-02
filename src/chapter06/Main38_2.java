package chapter06;

import java.util.ArrayList;

public class Main38_2 {
  public static void main(String[] args) {
    // Ví dụ 2: Ứng dụng quản lý sinh viên
    // - Tạo class Student với thuộc tính name, id
    // - Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor)
    // eg: new Student("Nam", 1); new Student("Eric", 2);
    // Yêu cầu: tìm và xuất ra:
    // - các student có tên bắt đầu là "Nguyễn"

    Student student1 = new Student("Nguyen Nam", 1);
    Student student2 = new Student("Eric", 2);
    Student student3 = new Student("Eric Nguyen", 4);
    Student student4 = new Student("Tran Uyen", 4);
    Student student5 = new Student("Nguyen Uyen", 4);

    ArrayList<Student> students = new ArrayList<Student>();
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);

    for (int i = 0; i < students.size(); i++) {
      if (students.get(i).getName().startsWith("Nguyen")) {
        System.out.println(students.get(i));
      }
    }

    System.out.println("Check arr: " + students); // them toString moi in ra duoc
  }
}
