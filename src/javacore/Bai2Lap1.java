package javacore;

import java.util.Scanner;

public class Bai2Lap1 {
  public static void main(String[] args) {
    // Bài 2: Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
    // Tính toán và in ra console:
    // - chu vi hình chữ nhật
    // - diện tích hình chữ nhật
    // - cạnh nhỏ nhất của hình chữ nhật

    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap chieu dai: ");
    int chieuDai = scanner.nextInt();

    System.out.print("Nhap chieu rong: ");
    int chieuRong = scanner.nextInt();

    // Tính chu vi hình chữ nhật
    int chuVi = 2 * (chieuDai + chieuRong);

    // Tính diện tích hình chữ nhật
    int dienTich = chieuDai * chieuRong;

    // Tìm cạnh nhỏ nhất
    int canhNhoNhat = Math.min(chieuDai, chieuRong);

    System.out.println("Chu vi = " + chuVi);
    System.out.println("Dien tich = " + dienTich);
    System.out.println("Canh nho nhat = " + canhNhoNhat);

    scanner.close();
  }
}
