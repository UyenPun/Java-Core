package javacore;

import java.util.Scanner;

public class Bai2Lap3 {
  public static void main(String[] args) {
    // Bài 2: Viết bảng cửu chương của 1 số nguyên bất kỳ
    // Gợi ý:
    // - Dùng vòng lặp từ 1 tới 10
    // sysout(" %d x %d = %d ", x, i, x*i)

    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap vao so nguyen bat ky: ");
    int n = scanner.nextInt();

    System.out.println("Bang cuu chuong " + n);
    for (int i = 0; i <= 10; i++) {
      System.out.printf("%d * %d = %d \n", i, n, i * n);
    }

    scanner.close();
  }
}
