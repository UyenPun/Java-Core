package chapter07;

public class SinhVienCoKhi extends SinhVien {
  protected double scoreCNC;
  protected double scorePLC;

  public SinhVienCoKhi(double scoreCNC, double scorePLC) {
    super();
    this.scoreCNC = scoreCNC;
    this.scorePLC = scorePLC;
  }

  public double getScoreCNC() {
    return scoreCNC;
  }

  public void setScoreCNC(double scoreCNC) {
    this.scoreCNC = scoreCNC;
  }

  public double getScorePLC() {
    return scorePLC;
  }

  public void setScorePLC(double scorePLC) {
    this.scorePLC = scorePLC;
  }

  @Override
  double getDiem() {
    return (this.scorePLC + this.scoreCNC) / 2;
  }

}
