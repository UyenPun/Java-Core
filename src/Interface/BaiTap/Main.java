package Interface.BaiTap;

public class Main {
  public static void main(String[] args) {
    Student st1 = new Student("123", "Uyen", 22, 8);
    System.out.println(st1);

    st1.setGrade(); // tính toán dựa vào điểm
    System.out.println("Info student: " + st1);

    Person p1 = new Person("123", "John", 24);
    System.out.println(p1);

  }
}
