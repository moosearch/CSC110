/*  Fill in the main method to test the other methods.
  When you find, in your tests that there is an error:
    Complete any method that is unfinished.
    Correct methods that do not work as you would expect.
*/

public class TestMethods
{
  public static void main (String [] args)
  {
    //Variables
    int n1 = 1;
    int d1 = 6;
    int n2 = 3;
    int d2 = 4;
    int d3 = lcm(d1,d2);
    n1 = d3/d1*n1;
    n2 = d3/d2*n2;
    int n3 = n1+n2;
    System.out.println((n1/n1)+"/"+(d1)+" + "+(d3/d2)+"/"+(d2)+" = "+(n3)+"/"+(d3));

    // Calls to methods

  }

  // return true if negative, false otherwise
  public static boolean isNegative(double n)
  {
    return n < 0.0;
  }

  // return absolute value
  public static int abs(int n)
  {
    if (isNegative(n))
      return n*-1;
    else
      return n;
  }

  // Greatest Common Divisor of two numbers is determined
  // by subtracting the lower from the higher until they
  // are equal.
  public static int gcd(int a, int b)
  {
    int temp;
    a = abs(a);
    b = abs(b);
    while(a!=b)
    {
      if (a > b) a = a-b;
      else b = b-a;
    }
    return b;
  }

  // Lowest Common Multiple of 2 numbers is determined by
  // dividing their product by their greatest common divisor
  public static int lcm(int a, int b)
  {
    a = abs(a);
    b = abs(b);
    return a*b/gcd(a,b);
  }

  public static double add(double a, double b){
    double x = a+b;
    return x;
  }

  public static int add1(int a, int b){
    int x = a+b;
    return x;
  }

  public static String concatenate(String a, String b, String c){
    String sentence = a + b + c;
    return sentence;
  }

}