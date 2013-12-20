public class Return{

  // ----------------------------------------------------------
  //  There are seven method calls* in the main method to five
  // different methods. Can you spot them? What do they return?
  // *NOT COUNTING calls to the System.out.println() method
  // ----------------------------------------------------------
  public static void main(String [] args){

    //Declare and initialize a String, put the length into an int:
    String name = "John Jacob Jingleheimer-Schmitt";
    int numChars = name.length();

    //Declare some doubles for the processing of 'value'
    double value = -37.52;
    double posValue = Math.abs(value);
    posValue = Math.round(posValue);

    //Declare and initialize 'result'
    double result = multiplyPositiveNums(numChars, posValue);

    //Print out the variables from above
    System.out.println("The name is: " + name);
    System.out.println("The length of the name is:  " + numChars);
    System.out.println("The value is:" + value);
    System.out.println("Absolute value of the value is:" + Math.abs(value) );
    System.out.println("Rounded, it is:" + posValue );
    System.out.println("Rounded positive value times the name's length:" + result );

    System.out.println();
    System.out.println("Three random numbers between 0 and 1: ");
    System.out.println( Math.random() );
    System.out.println( Math.random() );
    System.out.println( Math.random() );
  }


  // ----------------------------------------------------------
  //  Takes two numbers and multiplies them together
  // If the first parameter is negative the result will be wrong
  // ----------------------------------------------------------
  public static double multiplyPositiveNums(int a, double b){
    //for storing the growing sum
    double answer = 0;

    //multiplication the long way:
    // a * b = 'a' many groups of b:
    for(int i = 1; i <= a; i++){
      answer += b;
    }
    return answer;
  }
}