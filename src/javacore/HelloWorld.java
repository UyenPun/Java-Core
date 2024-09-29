package javacore;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		int age = 10;
		String name = "John";
		System.out.println("My age: " + age + ", My name: " + name);

//		2. Nhập từ bàn phím: java.util.Scanner là công cụ được java hỗ trợ sẵn, dùng để nhập dữ liệu từ bàn phím
//		scanner.nextLine() => nhận 1 dòng nhập từ bàn phím => trả ra dữ liệu string
//		scanner.nextInt() => nhận 1 số nguyên từ bàn phím => trả ra dữ liệu số nguyên
//		scanner.nextDouble() => nhận 1 số thực từ bàn phím => trả ra dữ liệu số thực

		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name is: ");
		String name2 = scanner.nextLine();
		System.out.println("Your age is: ");
		int age2 = scanner.nextInt();
		System.out.println("My name is " + name2 + ", age = " + age2);
		scanner.close();
	}
}
