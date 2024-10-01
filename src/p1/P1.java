package p1;

// trường hợp 1: (cùng package)
public class P1 {
  public static void main(String[] args) {
    P firstObj = new P();
    firstObj.a = 10;
    firstObj.b = 10;
    firstObj.c = 10;
    // firstObj.d = 10; // Error (d khong truy cap duoc) - Private
  }
}
