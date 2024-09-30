package javacore;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// For
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
		}

		// While: kiểm tra đúng mới chạy
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		// Do-While: chạy tối thiểu 1 lần
		int x = 0;
		do {
			System.out.println(x);
			x++;
		} while (x < 5);

		// Break: thoát ra vòng lặp
		for (int k = 0; k < 10; k++) {
			if (k == 4) {
				break;
			}
			System.out.println(k); // 0 1 2 3
		}

		// Continue: thoát ra vòng lặp khỏi vị trí if thôi xong tiếp tục ( thoát ra khỏi
		// vòng lặp đk đó)
		for (int m = 0; m < 10; m++) {
			if (m == 4) {
				continue;
			}
			System.out.println(m); // 0 1 2 3 5 6 7 8 9
		}
	}
}
