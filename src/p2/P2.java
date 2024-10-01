package p2;

import p1.P; // import

// trường hợp 2:(khác package)
public class P2 {
  public static void main(String[] args) {
    P firstObj = new P();
    firstObj.a = 10; // - public

    // Error
    // firstObj.b = 10; - default
    // firstObj.c = 10; - protected
    // firstObj.d = 10; - private

  }
}
