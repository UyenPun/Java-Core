package javacore;

public class HelloWorld {
	public static void main(String[] args) {
		// in ra kết quả nhưng "không xuống dòng": print
		System.out.print("Hi");

		// in ra kết quả rồi xuống dòng: print line
		System.out.println("Hello");

		// in ra kết quả có định dạng: print format
		System.out.printf("có %d người đăng ký", 40000);
		// %d: số nguyên
		// %f: số thực
		// - mặc định là 6 số lẻ
		// %.3f định dạng 3 số lẻ
		// %s: chuỗi
	}
}
