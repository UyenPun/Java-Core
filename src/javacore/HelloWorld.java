package javacore;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao ngay: ");
		int day = scanner.nextInt();
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Don't know");
		}

		// Bai Tap:
		System.out.println("================================================");
		// Bài tập: Viết chương trình lựa chọn chức năng
		// System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		// System.out.println("++ ------------------ ++");
		// System.out.println("| 1. Cộng |");
		// System.out.println("| 2. Trừ |");
		// System.out.println("| 3. Kết thúc |");
		// System.out.println("++ ------------------ ++");
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Lựa chọn của bạn là : ");
		// Yêu cầu:
		// Nếu nhập vào 1 => in ra "Bạn đã lựa chọn phép cộng"
		// Nếu nhập vào 2 => in ra "Bạn đã lựa chọn phép trừ"
		// Nếu nhập vào 3 => in ra "Bạn đã lựa chọn thoát chương trình" =>
		// System.exit(0);
		System.out.println(">> LUA CHON TINH NANG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cong              |");
		System.out.println("| 2. Tru               |");
		System.out.println("| 3. Ket thuc          |");

		System.out.print("Lua chon cua ban la: ");
		int tinhNang = scanner.nextInt();

		switch (tinhNang) {
			case 1:
				System.out.println("Ban da lua chon phep cong");
				break;
			case 2:
				System.out.println("Ban da lua chon phep tru");
				break;
			default:
				System.out.println("Lua chon thoat chuong trinh");
				System.exit(0);
				break;
		}

		int value = scanner.nextInt(); // check xem co thoat ra khong

		scanner.close();
	}
}
