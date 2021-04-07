class Person {
  private String name;
  private int age;
  private String color;

  Person(String pName, int pAge, String pColor){
    name = pName;
    age = pAge;
    color = pColor;
  }

  public int getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }

  public String getName() {
    return name;
  }


}