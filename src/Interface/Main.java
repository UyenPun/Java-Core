package Interface;

public class Main {
  public static void main(String[] args) {
    // IAnimal a = new IAnimal(); Error -> Interface không có khái niệm hàm tạo
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
