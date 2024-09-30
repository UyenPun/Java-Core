package javacore;

import java.util.Scanner;

public class Bai1Lap2 {
  public static void main(String[] args) {
    // Bài 1: Cho phương trình ax + b = 0
    // Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương
    // trình
    // trên
    // Gợi ý:
    // - Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
    // - Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
    // - Còn lại: x = -b/a => thông báo x = ?
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap vao so nguyen a: ");
    int a = scanner.nextInt();

    System.out.print("Nhap vao so nguyen b: ");
    int b = scanner.nextInt();

    System.out.printf("Giai phuong trinh %dx + %d = 0 \n", a, b);

    if (a == 0 && b == 0) {
      System.out.println("Phuong trinh co vo so nghiem");
    } else if (a == 0 && b != 0) {
      System.out.println("Phuong trinh vo nghiem");
    } else {
      double x = -b / (double) a;
      System.out.printf("Nghiem cua phuong trinh ax + b = 0 la: %.2f", x);
    }
  }
}
