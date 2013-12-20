// Wesley Chow
// V00727646 // Pi Approximator (Assignment 1)
// This program approximates the number pi by summing the first 8 terms of a series used to estimate it

public class Pi_Approximator{

    public static void main(String[] args){
      /*Defining variables*/
      double nextTerm=1;
      double denominator=1;
      double series=0;

      series+=(nextTerm/denominator);
      denominator+=2;
      nextTerm=nextTerm*(-1);
      series+=(nextTerm/denominator);

      denominator+=2;
      nextTerm=nextTerm*(-1);
      series+=(nextTerm/denominator);

      denominator+=2;
      nextTerm=nextTerm*(-1);
      series+=(nextTerm/denominator);

      denominator+=2;
      nextTerm=nextTerm*(-1);
      series+=(nextTerm/denominator);

      denominator+=2;
      nextTerm=nextTerm*(-1);
      series+=(nextTerm/denominator);

      denominator+=2;
      nextTerm=nextTerm*(-1);
      series+=(nextTerm/denominator);

      denominator+=2;
      nextTerm=nextTerm*(-1);
      series+=(nextTerm/denominator);

      /*Multiply by 4 to finish the calculation*/
      series=series*4;
      System.out.println("Summing up the first 8 terms of the series, pi is approximately");
      System.out.println(series+"."); /*output for program*/
    }

    //public static void Sum(){
      //double nextTerm=1;
      //double denominator=1;
      //double series=0;


    //}

}