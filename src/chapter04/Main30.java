package chapter04;

public class Main30 {
  public static void main(String[] args) {
    Product test = new Product();

    Product p1 = test.nhapThongTin("XE HOI", 1000, 0.2);
    test.xuatThongTin(p1);
    System.out.println("Tax: " + test.getTaxPrice(p1.getPrice(), p1.getTax()));
    ;

  }
}
