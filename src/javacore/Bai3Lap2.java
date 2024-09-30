package javacore;

import java.util.Scanner;

public class Bai3Lap2 {
  public static void main(String[] args) {
    // Bài 3: Viết chương trình tính số tiền điện (in kết quả ra console)
    // Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
    // - Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
    // - Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500
    // Gợi ý:
    // - Nếu số điện <= 100 => số tiền = số điện x 1000
    // - Nếu số điện > 100
    // => số tiền = 100 * 1000 + (số điện - 100) * 1500
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số điện: ");
    int soDien = scanner.nextInt();

    if (soDien >= 0 && soDien <= 100) {
      System.out.println("Gia dien la: " + (soDien * 1000));
    } else if (soDien > 100) {
      System.out.println("Gia dien la: " + (100 * 1000 + (soDien - 100) * 1500));
    }

  }
}
