package Polymorphism;

public class BabyDog1 extends Dog {
  public static void main(String[] args) {
    Animal a = new BabyDog1();
    Animal a1 = new Cat();

    a.eat();

    // chạy lên thằng cha gần nhất, ép kiểu
  }
}
