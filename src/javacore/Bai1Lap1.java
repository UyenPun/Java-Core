package javacore;

import java.util.Scanner;

public class Bai1Lap1 {
  public static void main(String[] args) {
    // Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
    // In ra màn hình với định dạng:
    // <tên_sinh_viên> có điểm = <điểm>
    // Ví dụ: "Eric" có điểm = 9.6
    // <tên sinh viên>: Eric
    // <điểm> : 10

    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập tên sinh viên");
    String nameStudent = scanner.nextLine();

    System.out.println("Nhập điểm trung bình");
    int diemTrungBinh = scanner.nextInt();

    System.out.println("Ten: " + nameStudent + " - Diem: " + diemTrungBinh);

    scanner.close();
  }
}
