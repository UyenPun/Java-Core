package Inheritance;

public class Main_Student {
  public static void main(String[] args) {

    SinhVienIT svIT1 = new SinhVienIT("Java", "123", "Uyen", 10, 0.1);
    System.out.println("svST1: " + svIT1.getLanguage() + " - id: " + svIT1.id);

    SinhVienCoKhi svCK1 = new SinhVienCoKhi("machine", "Eric", "345", 200, 0.2);
    System.out.println("svCK1 id: " + svCK1.skill);
  }
}

// => Tổng kết: 2 cách dùng super:
// 1. gọi đến method của thằng cha
// 2. gọi đến hàm tạo của thằng cha (vì con extend method,property thôi nên cần
// dùng super)