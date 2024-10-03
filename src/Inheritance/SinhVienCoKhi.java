package Inheritance;

public class SinhVienCoKhi extends SinhVien {
  protected String skill;

  @Override
  void tinhDiem() {
    // TODO Auto-generated method stub
  }

  public SinhVienCoKhi(String skill, String id, String name, double price, double tax) {
    super(id, name, price, tax);
    this.skill = skill;
  }

}
