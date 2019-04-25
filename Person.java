// Gibson Green
// Integration Project
/** Object class to describe a Person.
 * @author gibso
 *
 */
public class Person {
  protected String name;
  protected int age;
  protected boolean bornAsInfant;
  protected int numberOfFingers = 10;

  // constructor that accepts no arguments
  public Person() {}

  // constructor that accepts 2 arguments
  /** Constructor with 2 parameters.
   * @param n initial n variable parameter
   * @param a initial a variable parameter
   */
  public Person(String n, int a) {
    name = n;
    age = a;
    bornAsInfant = true;
  }

  // constructor that accepts 3 arguments
  /** Constructor with 3 parameters.
   * @param n initial n variable parameter
   * @param a initial a variable parameter
   * @param b initial b variable parameter
   */
  public Person(String n, int a, boolean b) {
    name = n;
    age = a;
    bornAsInfant = b;
    // numberOfFingers = nOF;
  }

  // constructor that accepts 4 arguments
  /** Constructor with 4 parameters.
   * @param n initial n variable parameter
   * @param a initial a variable parameter
   * @param b initial b variable parameter
   * @param n1 initial n1 variable parameter
   */
  public Person(String n, int a, boolean b, int n1) {
    name = n;
    age = a;
    bornAsInfant = b;
    numberOfFingers = n1;
    System.out.println();
  }

  /**
   * This basic accessor returns the name of Person.
   * 
   * @return
   */
  public String getName() {
    return name;
  }

  /**
   * this mutator method sets the Name of the person.
   * 
   * @param name sets the name
   */
  public void setName(String name) {
    // this displays the use of the this keyword, which allows me to use me as
    // the constructor name, while still allowing the compiler to know that
    // I am still talking about the String name
    this.name = name;
  }

  /**
   * getAge returns the value of the Age of the Person This is a basic accessor.
   * 
   * @return
   */
  public int getAge() {
    return age;
  }

  /**
   * This is a basic mutator Method to set the age of the Person.
   * 
   * @param age imports the age of being set
   */
  public void setAge(int age) {
    this.age = age;
  }

  // method that gets overridden by the child class Male
  // both Person and Male are capable of speaking, but say different things
  /**
   * Speak method that states that all humans are able to speak.
   */
  public void speak() {
    System.out.println("All humans speak");
  }
}
