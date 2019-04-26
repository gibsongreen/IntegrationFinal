// Gibson Green
// Integration Project
// April 18, 2019

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/** Main Method Program.
 * @author gibso This Program was written by Gibson Green The following program is an integration.
 *         of skills that have been learned through April 18, 2019 (Introduction to Programming)
 *         Topics covered include: primitive data types, strings, string concatenation, casting
 *         types, escape sequences, methods variables, for loops, while loops (& do-while), the
 *         Random class,) inheritance, polymorphism, arrays, ArrayLists, 2D-Arrays, searching
 *         arrays)
 */
public class HackerRank {
  /** args this is the main method.
   * @param args this is the main method.
   */
  public static void main(String[] args) {
    System.out.println("Hello, friend!\n");
    Scanner scan = new Scanner(System.in);

    boolean reenterProgram = true;
    while (reenterProgram) {

      System.out.println("The following are menu options for my Integration Project."
          + " Enter an integer from 1-17 to go to the specified area:");
      System.out.println("1. Math Operations");
      System.out.println("2. Data Types, Using Data Types, Variable, and Scope");
      System.out.println("3. Returning a Value, THE Ternary Operator, Method Call & Arguments");
      System.out.println("4. While Loop");
      System.out.println("5. For Loop");
      System.out.println("6. String and Variable Concatenation");
      System.out.println("7. Math Class");
      System.out.println("8. Random Class: Truth or Dare");
      System.out.println("9. Do-While Loop");
      System.out.println("10. compareTo & .equals Methods");
      System.out.println("11. Presedence");
      System.out.println("12. &&, || and ==");
      System.out.println("13. Inheritance, Polymorphism, Array List");
      System.out.println("14. Array Sum, Enhanced For Loop, 2D Array");
      System.out.println("15. Array: Find Index, Find Min., Find Length");
      System.out.println("16. Bulls player 2D array search");
      System.out.println("17. AppleProduct Polymorphism Example");
      System.out.println("Make your number selection between 1-17 here: ");


      // initializes variable for user input to 0
      // while there is bad input from the user, the user is prompted to reenter a
      // variable between 1 and 16, to go through the first iteration of the program
      // exceptions for wrong input mismatch and then the general exception catches
      // bad input from the user
      // if a selection between 1-16 is made, then that switch case is called
      int choice = 0;
      boolean badInputSelection = true;
      while (badInputSelection) {
        try {
          choice = scan.nextInt();
        } catch (InputMismatchException ex) {
          System.out.println("Bad selection");
          scan.next();
        } catch (Exception e) {
          System.out.println("Bad choice");
        }
        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6
            || choice == 7 || choice == 8 || choice == 9 || choice == 10 || choice == 11
            || choice == 12 || choice == 13 || choice == 14 || choice == 15 || choice == 16 ||
            choice == 17) {
          badInputSelection = false;
          System.out.println("Good choice");
        } else {
          System.out.println("Please choose an integer value between 1-16!");
        }
      }
      switch (choice) {
        case 1:
          // Using math operators +,-,*,/,%,++,--,+=
          final double xValue = 10;
          final double yValue = 5;
          final double wValue = 3;
          double v = 1;
          double u = 1;
          double g = 1;

          final double zValue = xValue + yValue;
          final double aValue = xValue - yValue;
          final double bValue = xValue * yValue;
          final double cValue = xValue / yValue;
          final double dValue = xValue % wValue;
          final double eValue = ++v;
          final double fValue = --u;
          g += 1;
          System.out.println("using + operator, adding 5 + 10 = " + zValue);
          System.out.println("using - operator, subtracting 5 - 10 = " + aValue);
          System.out.println("using * operator, multiplying 5 * 10 = " + bValue);
          System.out.println("using / operator, dividing 5 / 10 = " + cValue + " be careful!"
              + "values can be truncated depending on variable type and remainders.");
          System.out.println("using % operator, dividing 10 by 3, the remainder is = " + dValue);
          System.out.println("using ++ operator, adding 1 to v = " + eValue);
          System.out.println("using -- operator, subtracting 1 from u = " + fValue);
          System.out.println("using += operator, adding 1 to g = " + g);

          break;
        case 2:
          // The following is an explanation of the 8 primitive data types, also includes
          // escape sequences
          // Source: Oracle: Primitive Data Types
          // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
          System.out.println("There are 8 primitive data types in the Java Programming "
              + "language. They are as followed: \n");
          System.out.println("byte: The byte data type is an 8-bit signed two's complement\n"
              + " integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).\n"
              + "The byte data type can be useful for saving memory in large arrays\n"
              + "where the memory savings actually matters. They can also be used in\n"
              + "place of int where their limits help to clarify your code; the fact\n"
              + "that a variable's range is limited can serve as a form of documentation.\n");
          System.out
              .println("short:  The short data type is a 16-bit signed two's complement integer.\n"
                  + "It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).\n"
                  + "As with byte, the same guidelines apply: you can use a short to save memory"
                  + " in\n"
                  + "large arrays, in situations where the memory savings actually matters.\n");
          System.out
              .println("int:By default, the int data type is a 32-bit signed two's complement\n"
                  + "integer, which has a minimum value of -231 and a maximum value of 231-1.\n"
                  + "In Java SE 8 and later, you can use the int data type to represent an "
                  + "unsigned\n"
                  + "32-bit integer, which has a minimum value of 0 and a maximum value of 232-1.\n"
                  + "Use the Integer class to use int data type as an unsigned integer.\n"
                  + "See the section The Number Classes for more information. Static methods\n"
                  + "like compareUnsigned, divideUnsigned etc have been added to the Integer"
                  + " class\n" + "to support the arithmetic operations for unsigned integers.\n");
          System.out
              .println("long: The long data type is a 64-bit two's complement integer. The signed\n"
                  + "long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8\n"
                  + "and later, you can use the long data type to represent an unsigned 64-bit "
                  + "long,\n"
                  + "which has a minimum value of 0 and a maximum value of 264-1. Use this data"
                  + " type\n"
                  + "when you need a range of values wider than those provided by int. The Long "
                  + "class\n"
                  + "also contains methods like compareUnsigned, divideUnsigned etc to support"
                  + " arithmetic\n" + "operations for unsigned long.\n");
          System.out
              .println("float: The float data type is a single-precision 32-bit IEEE 754 floating\n"
                  + "point. Its range of values is beyond the scope of this discussion, but is "
                  + "specified\n"
                  + "in the Floating-Point Types, Formats, and Values section of the Java "
                  + "Language\n"
                  + "Specification. As with the recommendations for byte and short, use a float\n"
                  + "(instead of double) if you need to save memory in large arrays of"
                  + " floating point\n"
                  + "numbers. This data type should never be used for precise values, such as"
                  + " currency.\n"
                  + "For that, you will need to use the java.math.BigDecimal class instead"
                  + ". Numbers\n"
                  + "and Strings covers BigDecimal and other useful classes provided by the"
                  + " Java platform.\n");
          System.out.println(
              "double: The double data type is a double-precision 64-bit IEEE 754 floating point.\n"
                  + "Its range of values is beyond the scope of this discussion, but is specified"
                  + " in the\n"
                  + "Floating-Point Types, Formats, and Values section of the Java Language "
                  + "Specification.\n"
                  + "For decimal values, this data type is generally the default choice."
                  + " As mentioned\n"
                  + "above, this data type should never be used for precise values, such as"
                  + " currency.\n");
          System.out.println(
              "boolean: The boolean data type has only two possible values: true and false.\n"
                  + "Use this data type for simple flags that track true/false conditions."
                  + " This data type\n"
                  + "represents one bit of information, but its \"size\" isn't something "
                  + "that's precisely defined.\n");
          System.out.println(
              "char: The char data type is a single 16-bit Unicode character. It has a minimum\n"
                  + "value of '\\u0000' (or 0) and a maximum value of '\\uffff' "
                  + "(or 65,535 inclusive).\n");
          System.out.println(
              "Source for Data Types: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html");

          Boolean lastNameColor = true;
          int myAge = 19;
          double typicalDecimal = 2.0;
          String myMajor = "Software Engineering.";
          // the following variable, final int, can no longer be modified because of the
          // final keyword. The initialized as animalKing and assigned the value 22 can't
          // be changed or modified, rendering it essentially as a constant.

          final int animalKing = 22;
          // In the following two lines, an example of casting is present. Casting when
          // you take one data type and essential turn it into another data type. In the
          // following example, a double is casted into an int. Be careful! As you can see
          // in the print out of castingExampleTwo, part of the double value is truncated!
          double castingExampleOne = 75.5;
          int castingExampleTwo = (int) castingExampleOne;

          // Boolean used
          System.out.println("True or False: My last name is a color? " + lastNameColor);
          // int used
          System.out
              .println("I am currently " + myAge + " years old. That is, until February 5th!");
          // double used
          System.out.println(
              "There aren't many doubles that are applicable to interesting facts about me!"
                  + typicalDecimal);
          // String used
          System.out.println("In case you were wondering, my Major is " + myMajor);
          // What is a Variable with some escape sequences used
          System.out.println("What is a Variable?\n"
              + "\tA variable is the name given to a memory location. It is the basic unit\n"
              + " of storage in a program. Values stored in variables can be changed\n "
              + "during program execution. A variable is only a name given to a memory\n "
              + "location, all the operation done on the varibel effects that memory\n "
              + "location. All variables must be declared before use. Source:\n "
              + "GeeksforGeeks: Variables in Java");
          // What is Scope
          System.out.println("What is Scope?"
              + " In Java, scope is the idea that a variable is only accessible in \n"
              + "the method in which it was declared");
          // Final variable printed
          System.out.println(animalKing);
          // Casting example printed
          System.out.println(castingExampleTwo);
          break;
        case 3:
          // From the ReturningAValue class, printing the value made from the Math operations
          // and returning a value (view ReturingAValue for return statement use
          System.out.println(new ReturningAValue().usingReturn(5.5, 6.5));
          // Within in the Print Statement, is a usingReturn method being *called*
          // The *arguments* of the method are within the parentheses and are 5.5 & 6.5

          // here is a use of THE ternary operator in Java. I assigned a value of 1999 to the year
          // I was born and used the ternary operator to print "You were born in the 1900's if
          // you were born before 2000 and if you were born in 2000 or later, then "You were born
          // in the 2000's prints
          int yearIWasBorn = 1999;
          String value = yearIWasBorn <= 2000 ? "\nYou were born in the 1900's\n"
              : "\nYou were born in the 2000's\n";
          System.out.println(value);
          break;
        case 4:
          // the following is the use of a while loop
          // the while loop begins at i=1; which is assigned before the while loop
          // the condition inside the () says that as long as i is less than or equal to 5,
          // print i; the loop is incremented with i++ (increasing by a value of 1 every pass
          // through the loop); the loop terminates after the condition is meet and i=5
          int i = 1;
          while (++i <= 5) { // <= is a relation operator
            System.out.print(i);
            break; // when break statement is executed inside loop, loop statement
            /*
             * terminates immediately, program continues to execute with the statement following //
             * the loop statement // in this case, i is initialized at 1, pre-incremented by 1; i is
             * compared to 4 once the i value reaches 4, the loop terminates immediately
             */
          }

          // the follow print line separates the while and for loop lines
          System.out.println();
          break;
        case 5:
          // the following is the use of a for loop
          // the for loop begins with at the initialization statement of i=1 (the i value
          // starts at 1; the second statement within the condition is the termination statement
          // this states that the for loop will go until i is less than or equal to 5; the last
          // part of the condition is the incrementation of i, i is incremented by 1 every
          // pass through the for loop
          // for loop prints the value of i every pass through the loop until i = 5
          for (i = 1; i <= 5; i++) {
            if (i == 4) {
              System.out.print(i);
              continue; // when continue statement is executed inside loop, skips
              // iteration in a loop, it doesn't terminate the loop itself
              // in this case, continue statement to skip over the iteration of i = 4, and then
              // continue to the rest of the loop
            }
          }
          break;

        case 6:
          System.out.println();
          // String and Variable Concatenation that I figure out in here, from Hackerrank
          int int1 = 2;
          double double1 = 2.0;
          String string1 = "2";

          /* Declare and initialize second integer, double, and String variables. */
          int int2 = 2;
          double double2 = 2.0;
          String string2 = "2";
          /* Print the sum of both integer variables on a new line. */
          System.out.println("The result of + with ints is " + (int1 + int2));
          /* Print the sum of the double variables on a new line. */
          System.out.println("The result of + with doubles is " + (double1 + double2));
          /* Concatenate and print the String variables on a new line. */
          System.out.println("The result of + with Strings is " + (string1 + string2));
          break;

        case 7:
          double dog;
          dog = Math.min(7, 10);
          System.out.println(dog);

          double cat;
          cat = Math.sqrt(25);
          System.out.println(cat);

          double cow;
          cow = Math.pow(2, 3);
          System.out.println(cow);
          break;

        case 8:
          // Truth or dare Game; using Random numbers to generate whether you get truth or dare
          // Also using an if/else statement, n is between value of 1 and 2, if n == 2, then
          // Prints Truth and if any other value n, prints Dare
          Random rand = new Random();
          int n = rand.nextInt(2) + 1; {
          // == is a relation operator
          if (n == 2) {
            System.out.println("Truth");
          } else {
            System.out.println("Dare");
          }
        }
          break;

        case 9:
          // the following is a do while loop; guarantees that the code is run through once
          // even if the condition is false
          i = 1;
          do {
            System.out.println(i++);
          } while (i < 5);
          break;

        case 10:
          String findStrLength = "";
          String secondStr = "How long is the length of this string?";
          System.out.println(
              "The String is " + secondStr.compareTo(findStrLength) + " characters" + " long");
          String alpha = "hey";
          String beta = "hi";
          String gamma = "hello";
          String zeta = "hey";
          System.out.println(alpha.compareTo(beta)); // i is lexicographically greater than
          // e, hence the negative number
          System.out.println(alpha.compareTo(gamma)); // y is lexicographically greater than
          // l, hence the positive number
          System.out.println(alpha.compareTo(zeta)); // Strings are equal lexicographically
          System.out.println(alpha.equals(beta)); // returns false because Strings aren't equal
          System.out.println(alpha.equals(gamma)); // returns false because Strings aren't equal
          System.out.println(alpha.equals(zeta)); // returns true because Strings are equal
          // the == operator is used to compare two objects in, doing so by comparing the
          // memory location of objects and whether they point to the same location in memory
          break;

        case 11:
          // Operators with higher precedence are evaluated before operators with relatively
          // lower precedence. Operators on the same line have equal precedence. When operators
          // of equal precedence appear in the same expression, a rule must govern which is
          // evaluated first. All binary operators except for the assignment operators are
          // evaluated from left to right; assignment operators are evaluated right to left.
          System.out.println("Operator Precedence in order of Highest to Lowest:");
          System.out.println(" postfix \n unary \n multiplicative \n additive \n shift"
              + "\n relational \n equality \n bitwise AND \n bitwise exclusive OR, \n bitwise"
              + "inclusive OR \n logical AND \n logical OR \n ternary \n assignment ");
          break;

        case 12:
          // the following is an if statement using conditional operators && and ||
          int date = 5;
          int month = 2;
          int year = 1999;
          if ((date == 5) && (month == 2) || (year == 1999)) {
            System.out.println(month + "/" + date + "/" + year + " is my date of birth.");
          }
          break;

        case 13:
          Person carlos = new Person("Carlos", 7);
          carlos.speak();
          Person albert = new Person();
          Male jake = new Male("Jake", 17, true);
          // In the line above, an object named jake being an instance of the class of Male
          // displays the qualities of inheritance, if you take a look at the Person class and
          // then take a look at the Male class, you are able to see its benefits. By using
          // the extend keyword, Male is able to inherit the fields and methods from the
          // Person class. Many classes can extend on base class (in this case Person), the
          // child class (Male), inherits the fields and methods of the base class
          jake.speak();
          // from the carlos.speak() method call and the jake.speak() method call, overloading
          // a method is visible. In the parent class Person, a method is called speak, and is
          // called by the instance of Person called carlos, but it the class Male, there is
          // also is a method called Speak, since the Male class extends the Person class,
          // in the class of the jake.speak method call, the Male speak overrides the Person
          // speak method and is the one that is printed to the console
          albert.setAge(4);
          albert.setName("Albert");
          Person benj = new Person("Benjamin Button", 10, false);
          System.out.println("Hello, my name is " + carlos.name + " and I am " + carlos.age
              + " years old. True or False, I was born as an infant? ");
          System.out.println("Hello, my name is " + albert.name + " and I am " + albert.age
              + " years old. True or False, I was born as an infant? ");
          System.out.println("Hello, my name is " + benj.name + " and I am " + benj.age
              + " years old. True or False, I was born as an infant? " + benj.bornAsInfant);

          int[] boy = new int[5];
          for (int i1 = 0; i1 < boy.length; i1++) {
            boy[i1] = i1;
            System.out.println("index " + boy[i1]);
          }

          ArrayList<String> favoriteNbaPlayers = new ArrayList<String>();
          favoriteNbaPlayers.add("Giannis");
          favoriteNbaPlayers.add("Fred");
          favoriteNbaPlayers.add("Alan");
          favoriteNbaPlayers.add("Winifred");
          System.out.println(favoriteNbaPlayers);
          break;

        case 14:
          // this is is 1D-Array that adds its elements using a for loop
          // sum initialized as 0, for loop adds value of i1 into sum, then iterates
          // the loop again
          int sum = 0;
          int[] arraySum = new int[5];
          arraySum[0] = 1;
          arraySum[1] = 2;
          arraySum[2] = 3;
          arraySum[3] = 4;
          arraySum[4] = 5;
          for (int i1 = 0; i1 < arraySum.length; i1++) {
            sum += arraySum[i1];
          }
          System.out.println("The sum of arraySum is: " + sum);

          // the following char array uses the enhanced for loop to iterate through the
          // array and print our the values of the array
          char[] vowels = {'G', 'O', '_', 'B', 'A', 'N', 'A', 'N', 'A', 'S'};
          for (char item : vowels) {
            System.out.print(item);
          }

          System.out.println();
          // the following line is a 2D array
          int[][] twoDArray = new int[2][3];
          twoDArray[0][0] = 1;
          twoDArray[0][1] = 2;
          twoDArray[0][2] = 3;
          twoDArray[1][0] = 1;
          twoDArray[1][1] = 5;
          twoDArray[1][2] = 6;
          // the following for loop goes through the twoDArray and prints the outputs in
          // a table-like way
          for (int i1 = 0; i1 < twoDArray.length; i1++) {
            for (int j = 0; j < twoDArray[i1].length; j++) {
              System.out.print(twoDArray[i1][j] + " ");
            }
            System.out.println("");
          }
          // this for loop finds the value 1 throughout the array and prints the index
          // where it is
          // prints in the following format: value searching for = [i3][j]
          for (int i3 = 0; i3 < twoDArray.length; i3++) {
            for (int j = 0; j < twoDArray[i3].length; j++) {
              if (twoDArray[i3][j] == 1) {
                System.out.println("[" + i3 + "][" + j + "]");
              }
            }
          }
          break;

        case 15:
          int[] birthdayArray = new int[6];
          birthdayArray[0] = 2;
          birthdayArray[0] = 5;
          birthdayArray[0] = 1999;
          birthdayArray[0] = 3;
          birthdayArray[0] = 26;
          birthdayArray[0] = 1999;
          // This output uses the array birthday_array and calls the class method, findIndex
          // to find the index of the element that is given (in this case 3)
          // the next output finds the minimum value of birthday_array by calling the
          // OneDArray class method getMin
          // the next output prints the length of birthday_array
          System.out.println("The array index at value 3 of birthday_array is "
              + OneDArray.findIndex(birthdayArray, 3));
          System.out.println(
              "The minimum value in birthday_array is: " + OneDArray.getMin(birthdayArray));
          System.out.println("The length of birthday_array is " + birthdayArray.length);
          break;

        case 16:
          int[][] bullsPlayerNumbers =
              {{20, 51, 9, 34, 32, 6}, {3, 15, 8, 25, 42, 7}, {24, 22, 44, 41, 14, 45}};
          for (int i2 = 0; i2 < bullsPlayerNumbers.length; i2++) {
            for (int j = 0; j < bullsPlayerNumbers[i2].length; j++) {
              if (bullsPlayerNumbers[i2][j] == 24) {
                System.out.println("Hello there, I am trying to figure out where number 24"
                    + " is in the array, can you help me? [" + i2 + "]" + "[" + j + "]");
                // this for loop within a for loop, hehe, searches through the array
                // that represents the roster of the Chicago Bulls, the player I selected
                // is Lauri Markkanen, number 24!
              } // add comments to these to figure out which braces apply to which one
            }
          }
          break;
          
        case 17 :
          AppleProducts iPhone1 = new AppleProducts();
          iPhone1.communicate();
          iPhone1.showProductType();
          iPhone1.setCharging(true);
          System.out.println();
          
          iPhone iPhone2 = new iPhone();
          iPhone2.communicate();
          iPhone2.showProductType();
          System.out.println();
          
          AppleWatch appleWatch1 = new AppleWatch();
          appleWatch1.communicate();
          appleWatch1.takeEKG();
          appleWatch1.showProductType();
          System.out.println();
          
          MacBook macBook1 = new MacBook();
          macBook1.communicate();
          macBook1.showProductType();
          System.out.println();
          
          AppleProducts[] myAppleProducts = { iPhone1, iPhone2, appleWatch1, macBook1 };
          for (AppleProducts heresAFew : myAppleProducts)
          {
            heresAFew.communicate();
          }   
                  
        default:
          System.out.println("This is a default case");
      }
      // the following try/catch along with if statement allows the user to reenter the overall
      // program through user input, enter 0 for reenter and 1 to exit.
      // input exceptions are handled and the user is prompted to reenter their selection
      // if one of the options isn't chosen
      System.out.println();
      System.out.println("Would you like to reeneter the Program: Enter 0 for yes, and 1 for no.");
      System.out.println();
      try {
        choice = scan.nextInt();
      } catch (InputMismatchException eq) {
        System.out.println("Choose 0 to reenter the program, or 1 to exit.");
        scan.next();
      } catch (Exception eg) {
        System.out.println();
      }
      if (choice == 1) {
        reenterProgram = false;
        System.out.println("The program is terminated.");
      } // if (choice == 1)
    } // while (reenterProgram)
    scan.close();
  } // this is the main method curly brace
}
