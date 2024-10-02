package Inheritance;

public class SinhVienCoKhi extends SinhVien {
  protected String skill;

  public SinhVienCoKhi(String skill, String id, String name, double price, double tax) {
    super(id, name, price, tax);
    this.skill = skill;
  }

}
