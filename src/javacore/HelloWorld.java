package javacore;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// CÁCH 1:
		int[] numbers = { 1, 20, 5, 8, 9, 10, 2 };

		Arrays.sort(numbers); // sắp xếp

		System.out.println(Arrays.toString(numbers));

		// Cách sắp xếp sort bằng for
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) { // <: giảm dần
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(numbers));
	}
}
