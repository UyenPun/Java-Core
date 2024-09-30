package javacore;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// CÁCH 1:
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" }; // 0 1 2 (Không thể thêm phân tử or xóa đi)

		System.out.println("Length: " + cars.length); // độ dài
		System.out.println("Phan tu: " + cars[0]); // phần tử
		System.out.println(Arrays.toString(cars)); // in ra mảng

		// Loop Through an Array (duyệt tất cả phần tử của mảng)
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		// ForEach:
		for (String i : cars) {
			System.out.println(i);
		}

		// CÁCH 2:
		String[] car = new String[5]; // khai báo mảng có 5 phần tử
		car[0] = "1";

		System.out.println(car[0]);

	}
}
