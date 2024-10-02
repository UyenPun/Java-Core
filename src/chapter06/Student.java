package chapter06;

public class Student {
  // Ví dụ 2: Ứng dụng quản lý sinh viên
  // - Tạo class Student với thuộc tính name, id
  // - Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor)
  // eg: new Student("Nam", 1); new Student("Eric", 2);
  // Yêu cầu: tìm và xuất ra:
  // - các student có tên bắt đầu là "Nguyễn"
  private String name;
  private int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }

}
