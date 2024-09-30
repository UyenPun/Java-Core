package javacore;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int score = 10;

		// Neu True moi in ra
		if (score > 5) {
			System.out.println("Qua mon");
		}
		// Nếu dk trên không xảy ra thì dk phủ định của nó là else
		else {
			System.out.println("Rot mon");

		}

		// System.out.println("Run here: " + (score == 5));

		System.out.println("============================= Bai Tap =============================");

		// Viết chương trình cho phép nhập vào số tiền thuế (đơn vị là triệu đồng), và
		// in ra kết quả:
		// - dưới 10M: không đóng thuế
		// - từ 10M tới 15M: thuế 10%
		// - từ 15 tới 30M : thuế 20%
		// - trên 30M: thuế 50%
		// Ví dụ: nhập vào 25M -> in ra kết quả "thuế 20%
		// tax: tien thue

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so tax: ");
		double tax = scanner.nextDouble();

		if (tax < 10_000_000) {
			System.out.println("Khong dong thue");
		} else if (tax >= 10_000_000 && tax < 15_000_000) {
			System.out.println("Thue 10%");
		} else if (tax >= 15_000_000 && tax < 30_000_000) {
			System.out.println("Thue 20%");
		} else if (tax >= 30_000_000) {
			System.out.println("Thue 50%");
		}
	}
}
