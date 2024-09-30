package javacore;

import java.util.Scanner;

public class Bai1Lap3 {
  public static void main(String[] args) {
    // Bài 1: Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả
    // số đấy là số
    // nguyên tố hay không ?
    // Gợi ý:
    // - Số nguyên tố là số chỉ chia hết cho 1 và chính nó (tối đa 2 ước)
    // - Dùng vòng lặp (2, Số nguyên -1). Nếu số nguyên chia hết cho i => ko là số
    // nguyên tố
    // - Sử dụng toán tử % để biết có chia hết hay không ?

    Scanner scanner = new Scanner(System.in);

    System.out.print("Nhap vao 1 so nguyen bat ky: ");
    int n = scanner.nextInt();

    // 1 < xxx < value: Quét ước trong khoảng xxxxx
    int count = 0; // Biến đếm số ước
    for (int i = 2; i <= n - 1; i++) {
      if (n % i == 0) { // Nếu n % i == 0, nghĩa là i là ước của n.
        System.out.println("Uoc so khac: " + i);
        count++;
        // break;
      }
    }

    if (count == 0) {
      System.out.printf("So %d la so nguyen to", n);
    } else {
      System.out.printf("So %d khong la so nguyen to", n);
    }

    scanner.close();
  }
}
