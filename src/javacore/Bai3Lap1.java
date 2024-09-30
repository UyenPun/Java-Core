package javacore;

import java.util.Scanner;

public class Bai3Lap1 {
  public static void main(String[] args) {
    // Bài 3: Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
    // Tính và xuất ra thể tích của hình lập phương.
    // thể tích = cạnh x cạnh x cạnh = cạnh^3 = Math.pow(canh, 3)

    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập cạnh của hình lập phương: ");
    double canh = scanner.nextDouble();
    System.out.println("The tich cua hinh lap phuong = " + Math.pow(canh, 3));

    scanner.close();
  }
}
