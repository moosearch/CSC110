/*  Program SimpleMethods 
  Make methods of the code under printIntro, PrintHeader and doCalculation
*/

public class SimpleMethods
{
  //static class variable represents constant in java
  public static final double PI = 3.14159;
  
  public static void main (String [] args)
  {
  
    // printIntro
    System.out.print("Program calculates and displays the "); 
    System.out.println("ratio of the outside surface of an object"); 
    System.out.println("to the inside area of an object. \n"); 
    System.out.print("One consequence is that smaller bodies dissipate "); 
    System.out.println("heat more quickly than bigger ones since they "); 
    System.out.print("have relatively larger surface areas.");
    System.out.println();
    
    //printHeader
    System.out.println("Increasing radius (size) shows decreasing ratio " + 
              "of circumference/area");
    System.out.println(); 
    System.out.println(); 
    System.out.println("Radius   Ratio"); 
    System.out.println("------   -----"); 
    
    //doCalculation
    double area;
    double circumference;
    double ratio;
    
    //calculate ratios for r values 1 to 10
    for(int r = 1; r <= 10; r++)
    {
      circumference = 2 * PI * r;
      area = PI * (r * r);  // brackets unnecessary
      ratio = circumference/area;
      System.out.println(r + "  " + ratio); 
    }
    
  }
}
