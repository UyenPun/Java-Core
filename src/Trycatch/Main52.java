package Trycatch;

import java.util.Scanner;

public class Main52 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Nhap x: ");
      try {
        int x = scanner.nextInt();
        try {
          System.out.println("Ket qua 10/x = " + (10 / x));
          break;
        } catch (Exception e) {
          System.out.println("Run x = " + x);
        }
      } catch (Exception e) {
        scanner.next();
        System.out.println("Run Error");
      }
    }

  }
}
