import java.util.*;
import java.awt.*;
public class Testing{

  public static void main(String[]args){
    Scanner stdin = new Scanner(System.in);

  }


  public static double rounding(double x,double y){
    double f = Math.pow(10,y);
    System.out.println(x);
    x = x*f;
    double value = Math.round(x);
    System.out.println(x);
    System.out.println(f);
    System.out.println(value);
    System.out.println(value/f);
    return value/f;
  }

}