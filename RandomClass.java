// Gibson Green
// Integration Project
import java.util.Random;

/**
 * Random class gives random class features of truth or dare game.
 * 
 * @author gibso
 *
 */
public class RandomClass {
  {
    // Truth or dare Game; using Random numbers to generate whether you get truth or dare
    // Also using an if/else statement, n is between value of 1 and 2, if n == 2, then
    // Prints Truth and if any other value n, prints Dare
    Random rand = new Random();
    int num = rand.nextInt(2) + 1;
    if (num == 2) {
      System.out.println("Truth");
    } else {
      System.out.println("Dare");
    }
  }
}
