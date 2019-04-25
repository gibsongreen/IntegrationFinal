// Gibson Green
// Integration Project
/**The Male class is an extended class of the Person class and represents the Male gender.
 * @author gibso
 *
 */
public class Male extends Person {
  private int numberOfFingers = 11;

  /** hello person.
   * @param n initial n variable parameter
   * @param a initial a variable parameter
   * @param b initial b variable parameter
   */
  public Male(String n, int a, boolean b) {
    name = n;
    age = a;
    bornAsInfant = b;

    System.out.println("Hello, I am a male. My name is " + n + ". My age is " + a + ", it is " + b
        + " I was born an infant, and I have " + super.numberOfFingers + " fingers!");
    // this displays the use of super, number of fingers a person normally has is 10
    // chromosomal development, after the male develops an 11th finger
    // for some reason, this class only has 10
    // for males, the super keyword is used so that males only have 10 fingers

    System.out.println(super.numberOfFingers);
    System.out.println(numberOfFingers);
  }

  public void speak() {
    System.out.println("Males speak loud");
  }
}
