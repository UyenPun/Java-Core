package chapter04;

public class Product {
  private String name; // tên sản phẩm
  private double price; // giá sản phẩm
  private double tax; // thuế sản phẩm

  // Constructor
  public Product() {
  }

  public Product(String name, double price, double tax) {
    this.name = name;
    this.price = price;
    this.tax = tax;
  }

  // Getter & Setter
  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public double getTax() {
    return tax;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  // 2 method:
  public Product nhapThongTin(String name, double price, double tax) {
    Product product = new Product(name, price, tax);
    return product;
  }

  public void xuatThongTin(Product product) {
    System.out.println("Name: " + product.getName() + " price: " + product.getPrice() + " tax: " + product.getTax());
  }

  public double getTaxPrice(double price, double tax) {
    return price * tax;
  }
}
