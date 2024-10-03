package Interface;

// Pig"implements"the Animal interface
// khi kế thừa phải ghi đè lại những method
class Pig implements IAnimal {
  public void animalSound() {
    // The body of animalSound( ) is provided here
    System.out.println("The pig says: wee wee");
  }

  public void sleep() {
    // The body of sleep( ) is provided here
    System.out.println("Zzz");
  }
}
