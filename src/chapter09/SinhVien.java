package chapter09;

import java.util.Scanner;

public class SinhVien {
  private int masv;
  private String hoten;
  private double diem;
  private int age;

  public SinhVien(int masv, String hoten, double diem, int age) {
    this.masv = masv;
    this.hoten = hoten;
    this.diem = diem;
    this.age = age;
  }

  public int getMasv() {
    return masv;
  }

  public void setMasv(int masv) {
    this.masv = masv;
  }

  public String getHoten() {
    return hoten;
  }

  public void setHoten(String hoten) {
    this.hoten = hoten;
  }

  public double getDiem() {
    return diem;
  }

  public void setDiem(double diem) {
    this.diem = diem;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "SinhVien [masv=" + masv + ", hoten=" + hoten + ", diem=" + diem + ", age=" + age + "]";
  }

}
