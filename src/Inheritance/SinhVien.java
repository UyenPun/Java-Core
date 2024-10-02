package Inheritance;

public class SinhVien {

  protected String id; // mã số sinh viên
  protected String name; // tên
  protected double price; // học phí
  protected double tax; // tỉ lệ thuế

  public SinhVien(String id, String name, double price, double tax) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.tax = tax;
  }

  public double getPriceTax(double price, double tax) {
    return this.price * price + tax;
  }

  public void infor() {
    System.out.println("run info from SinhVien (Parent)");
  }
}
