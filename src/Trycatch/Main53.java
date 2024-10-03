package Trycatch;

import java.util.Scanner;

public class Main53 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap x: ");

    // Cách 1:
    try {
      int x = scanner.nextInt();
      System.out.println("Run try");
    } catch (Exception e) {
      System.out.println("Run catch");

    }

    // xong rồi thì đóng đi, xóa đi (kiểu v)
    // luôn chạy vào finally dù đúng hay sai (đóng kết nối)
    finally {
      scanner.close();
      System.out.println("Run finally");
    }

    // Cách 2: đọc link
    try (Scanner sc = new Scanner(System.in)) {
      int x = scanner.nextInt();
    }
  }
}
