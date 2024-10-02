package chapter04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main36 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Double> arrNum = new ArrayList();
    while (true) {
      System.out.print("Nhap vao 1 so thuc bat ky: ");

      double input = scanner.nextDouble();
      arrNum.add(input);

      scanner.nextLine(); // enter

      System.out.print("Continue Yes/No?");
      String option = scanner.nextLine();
      if (option.equals("N") || option.equals("n") || option.equals("No") || option.equals("NO")) {
        break;
      }
    }

    System.out.println("Check arrat: " + arrNum);

    // Tinh tong:
    // For each
    double sum = 0;
    for (Double n : arrNum) {
      sum += n;
    }
    System.out.println("Tong = " + sum);

    // for
    double sum2 = 0;
    for (int i = 0; i < arrNum.size(); i++) {
      sum2 += arrNum.get(i);
    }
    System.out.println("Tong = " + sum2);

  }
}
