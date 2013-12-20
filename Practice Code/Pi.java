import java.util.*;

public class Pi{
  public static void main(String[] args){

    double nextTerm=1;
    double denominator=1;
    double series=0;
    series=series+(nextTerm/denominator);
    Sum(nextTerm,denominator,series);
    Sum(nextTerm,denominator,series);
    Sum(nextTerm,denominator,series);
    Sum(nextTerm,denominator,series);
    Sum(nextTerm,denominator,series);
    Sum(nextTerm,denominator,series);
    Sum(nextTerm,denominator,series);
    System.out.println("The approximate value for pi is "+series+".");
  }

  public static double Sum(double nextTerm, double denominator, double series){
      denominator=denominator+=2;
      nextTerm=nextTerm*(-1);
      series=series+(nextTerm/denominator);
      return series;

  }

}