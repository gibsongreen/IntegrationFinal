/** OneDArray Class holds static methods (specific to the class) that finds the Index in an array.
 * given the element, and finds the minimum value in an array
 * @author gibso
 */
public class OneDArray {
  /**findIndex method intakes an array and an element value, and finds the matching index to the.
   * element value
   * 
   * 
   * @param findIndexofArray describes the find IndexArray that finds the index
   * @param elementValue describes the array element that is being looked for
   * @return
   */
  public static int findIndex(int[] findIndexofArray, int elementValue) {
    // first, if statement used to make sure that the array isn't null, if it is then
    // -1 is displayed to the console (has to return an int because later return int
    // for when index is found
    if (findIndexofArray == null) {
      return -1;
    }
    // declaring a int named lengthOfArray, and setting it to the length of array arr, by using
    // the length property of arrays;
    int lengthOfArray = findIndexofArray.length;
    int i = 0;

    // while the index is less than the length of the array, there is an if statement
    // that compares the length of the array element to the int y, and returns i
    // if the value of the element and the value of y are the same.
    // if they aren't the same then i is increment by 1 until the element is found
    // returns -2
    while (i < lengthOfArray) {
      if (findIndexofArray[i] == elementValue) {
        return i;
      } else {
        i++;
      }
    }
    return -2;
  }

  /**getMin method intakes an array and iterates through the array to find the minimum value.
   * @param minimumArray imports the minimumArray Array to the method
   * @return
   */
  public static int getMin(int[] minimumArray) {
    // this first line sets the array element at index 0 as the minimum
    int min = minimumArray[0];
    // the for loop starts at the array element in index 1 (because index 0 was already
    // already established as minimum) and compares that element to the value of the
    // current minimum, if the value of the array element being tested is smaller, then
    // it is set as the new minimum, and then the loop cycles until all the array elements
    // are tested, then the minimum is return
    for (int i = 1; i < minimumArray.length; i++) {
      if (minimumArray[i] < min) {
        min = minimumArray[i];
      }
    }
    return min;
  }
}
