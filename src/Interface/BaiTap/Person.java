package Interface.BaiTap;

public class Person implements IPerson {
  protected String id;
  protected String name;
  protected int age;

  @Override // annonation (~comment)
  public void display() {
    // TODO Auto-generated method stub

  }

  @Override
  public void input() {
    // TODO Auto-generated method stub

  }

  public Person(String id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Dùng để in ra thông tin của một Obj
  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
  }

}
