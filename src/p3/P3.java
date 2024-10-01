package p3;

import p1.P;

// trường hợp 3 (kế thừa)
public class P3 extends p1.P {
  private void test() {
    P firstObj = new P();
    firstObj.a = 10;
    // firstObj.b = 10; - default
    super.c = 10; // protected
    // firstObj.d = 10; - private
  }

  public static void main(String[] args) {

  }
}
