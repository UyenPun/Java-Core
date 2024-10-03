package chapter07;

public class Main {
  public static void main(String[] args) {
    SinhVien it1 = new SinhVienIT(10, 7);
    System.out.println("Sinh vien ITScore: " + it1.getDiem());

    SinhVien ck1 = new SinhVienCoKhi(10, 10);
    System.out.println("Sinh vien CKScore: " + ck1.getDiem());

  }
}
