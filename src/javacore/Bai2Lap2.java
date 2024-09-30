package javacore;

import java.util.Scanner;

public class Bai2Lap2 {
  public static void main(String[] args) {
    // Bài 2: Cho phương trình: ax^2 + bx + c = 0
    // Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương
    // trình
    // trên
    // Gợi ý:
    // - Nếu a = 0 => làm tương tự ví dụ bài 1
    // - Nếu a # 0:
    // - Tính delta = b^2 - 4ac.
    // - Nếu delta < 0 => thông báo "phương trình vô nghiệm"
    // - Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
    // - Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
    // x1 = (-b + căn(delta))/(2*a)
    // x2 = (-b - căn(delta))/(2*a)
    Scanner scanner = new Scanner(System.in);

    // Nhập các hệ số a, b, c
    System.out.print("Nhap vao so nguyen a: ");
    int a = scanner.nextInt();

    System.out.print("Nhap vao so nguyen b: ");
    int b = scanner.nextInt();

    System.out.print("Nhap vao so nguyen c: ");
    int c = scanner.nextInt();

    // Xử lý từng trường hợp
    if (a == 0) {
      // Trường hợp phương trình bậc nhất bx + c = 0
      if (b == 0) {
        if (c == 0) {
          System.out.println("Phuong trinh co vo so nghiem");
        } else {
          System.out.println("Phuong trinh vo nghiem");
        }
      } else {
        float x = (float) -c / b;
        System.out.println("Phuong trinh co mot nghiem x = " + x);
      }
    } else {
      // Trường hợp phương trình bậc hai
      float delta = (float) Math.pow(b, 2) - 4 * a * c;
      if (delta < 0) {
        System.out.println("Phuong trinh vo nghiem");
      } else if (delta == 0) {
        float x = (float) -b / (2 * a);
        System.out.println("Phuong trinh co nghiem kep x = " + x);
      } else {
        float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
        float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Phuong trinh co 2 nghiem rieng biet:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
      }
    }

    scanner.close();
  }
}
