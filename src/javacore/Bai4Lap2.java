package javacore;

import java.util.Scanner;

public class Bai4Lap2 {
  public static void phuongTrinhBacNhat() {
    System.out.println("PTBN");
  }

  public static void phuongTrinhBacHai() {
    System.out.println("PTBH");
  }

  public static void tinhTienDien() {
    System.out.println("TTD");
  }

  public static void main(String[] args) {
    // Bài 4: Viết chương trình tổ chức menu:
    // System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
    // System.out.println("++ ----------------------------------------- ++");
    // System.out.println("| 1. Giải phương trình bậc nhất |");
    // System.out.println("| 2. Giải phương trình bậc hai |");
    // System.out.println("| 3. Tính số tiền điện |");
    // System.out.println("| 4. Kết thúc |");
    // System.out.println("++ ------------------ ++");
    // Yêu cầu:
    // - Khi nhập vào "tính năng", sẽ thực hiện theo 3 bài tập đã làm ở trên

    System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
    System.out.println("++ ----------------------------------------- ++");
    System.out.println("| 1. Giải phương trình bậc nhất               |");
    System.out.println("| 2. Giải phương trình bậc hai                |");
    System.out.println("| 3. Tính số tiền điện                        |");
    System.out.println("| 4. Kết thúc                                 |");
    System.out.println("++ ------------------------------------------++");

    Scanner scanner = new Scanner(System.in);
    System.out.print("Lua chon cua ban: ");
    int number = scanner.nextInt();

    switch (number) {
      case 1:
        phuongTrinhBacNhat();
        break;
      case 2:
        phuongTrinhBacHai();
        break;
      case 3:
        tinhTienDien();
        break;
      default:
        System.out.println("Ban da thoat chuong trinh");
        System.exit(0);
    }

    scanner.close();

  }
}
