package Inheritance;

public class SinhVienIT extends SinhVien {
  private String language;

  public SinhVienIT(String language, String id, String name, double price, double tax) {
    super(id, name, price, tax);
    this.language = language;
  }

  public void getMoney() {
    super.infor(); // luôn gọi đến thằng cha
                   // this: gọi thằng con
  }

  public void infor() {
    System.out.println("run info from SinhVienIT (Child)");

  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
