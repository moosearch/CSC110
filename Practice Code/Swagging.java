import java.util.*;
public class Swagging{

  public static void main(String [] args){
    Scanner stdin = new Scanner(System.in);
    System.out.print("Enter your grade: ");
    //double x=stdin.nextDouble();
    String x = "no grade";
    if(x>95 && x<=100){
      System.out.println("A+ for you!");
      grade = "A+";
    }else if (x>90 && x<=95){
      System.out.println("A for you!");
      grade = "A";
    }else if (x>85 && x<=90){
      System.out.println("A- for you!");
      grade = "A-";
    }else if (x>80 && x<=85){
      System.out.println("B+ for you!");
      grade = "B+";
    }else if (x>75 && x<=80){
      System.out.println("B for you!");
      grade = "B";
    }else if (x>70 && x<=75){
      System.out.println("B- for you!");
      grade = "B-";
    }else if (x>65 && x<=70){
      System.out.println("C+ for you!");
      grade = "C+";
    }else if (x>60 && x<=65){
      System.out.println("C for you!");
      grade = "C";
    }else if (x>55 && x<=60){
      System.out.println("C- for you!");
      grade = "C-";
    }else if (x>=50 && x<=55){
      System.out.println("D for you!");
      grade = "D";
    }else if (x>=0 && x<50){
      System.out.println("You failed!");
      grade = "Fail";
    }else{ //(x<0 && x>100)
      System.out.println("Stop trolling my program");
    }
  }

}