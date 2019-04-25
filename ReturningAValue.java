
public class ReturningAValue {
  // usingReturn is a Method, it uses 2 parameters that are type of
  // double; they are numberOne and numberTwo
  // returns the value of sum, which uses the 2 parameters to complete a math operation
  // this method is printed in the main method
  // the entire following line is called a Method Header
  // double numberOne & double numberTwo in the header are called parameters
  double usingReturn(double numberOne, double numberTwo) {
    double sum;
    sum = (numberOne + numberTwo) / 3;
    return sum;
  }
}
