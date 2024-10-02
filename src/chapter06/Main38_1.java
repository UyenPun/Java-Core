package chapter06;

import java.util.Scanner;

public class Main38_1 {
  public static void main(String[] args) {
    // Ví dụ 1: Nhập username và password từ bàn phím.
    // Nếu username = "hoidanit" và password > 6 ký tự thì hợp lệ
    // gợi ý: sử dụng equals để so sánh; length để check chiều dài
    Scanner scanner = new Scanner(System.in);
    String username;
    String password;

    while (true) {
      System.out.print("Nhap vao username: ");
      username = scanner.nextLine();

      System.out.print("Nhap vao password: ");
      password = scanner.nextLine();

      // Kiểm tra điều kiện hợp lệ
      if (username.equals("tranuyen") && password.length() > 6) {
        System.out.println("Hop le");
        break; // Thoát khỏi vòng lặp nếu hợp lệ
      } else {
        System.out.println("Khong hop le, vui long nhap lai.");
      }
    }

    scanner.close();
  }
}
