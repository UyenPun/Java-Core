package chapter04;

import java.util.ArrayList;

public class Main33 {
  public static void main(String[] args) {
    // Cach 1:
    ArrayList arrayList = new ArrayList(); // Không biết kiểu giá trị lưu trữ sẽ ntn
    arrayList.add(2); // interger -> Interger
    arrayList.add("hello");
    arrayList.size(); // size
    arrayList.get(1); // lay phan tu

    // add : thêm phần tử vào cuối
    // remove: xóa
    // clear: xóa tất cả
    // get: truy xuất phần tử tại vị trí

    System.out.println(arrayList.toString() + " " + arrayList.size());

    // Cach 2: cho phép add thêm đúng type mong muốn
    ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
    // ArrayList<String> arrayList2 = new ArrayList<String>();
    arrayList.add(3);
    arrayList.add(5);
  }
}
