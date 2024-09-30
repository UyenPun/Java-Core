package javacore;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// Min or Max
		int a = 5;
		int b = 6;
		int c = Math.max(a, b);
		System.out.println("Max = " + c);

		// Lũy thừa
		double d = 2;
		double e = 2;
		double f = Math.pow(d, e);
		System.out.println("Pow = " + f);

		// Thực hành
		Scanner scanner = new Scanner(System.in);
		System.out.print("First number: ");
		int num1 = scanner.nextInt();

		System.out.print("Second number: ");
		int num2 = scanner.nextInt();
		System.out.println("Min = " + Math.min(num1, num2));
		scanner.close();

	}
}
