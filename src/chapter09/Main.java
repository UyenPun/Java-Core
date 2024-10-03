package chapter09;

import java.util.Scanner;

public class Main {

  // static: có thể dùng ngoài phạm vi class, không cần phải tạo mới đối tượng, ở
  // dưới chỉ cần gọi method là dùng được
  public static int nhapmaSV() {
    int result;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Nhap ma sinh vien: ");
      try {
        result = scanner.nextInt();
        break;
      } catch (Exception e) {
        System.out.println("Ma so sinh vien khong hop le. Nhap lai!");
        scanner.next();
      }
    }
    scanner.close();

    return result;
  }

  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      int mssv = nhapmaSV();
      // System.out.println("Ma so sinh vien = " + mssv);

      SinhVien sv = new SinhVien(mssv, "Tran Uyen", 10, 22);
      System.out.println("Ma so sinh vien = " + sv);
    }
  }
}
