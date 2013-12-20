// Purpose: To demonstrate repetitive code!
import java.util.*;

public class ScannerEx {
  // method main(): application entry point
  public static void main(String[] args){
    Scanner stdin = new Scanner(System.in);
    John(stdin);
    Jane(stdin);
    Jim(stdin);
  }
    // Exam scores for John
  public static void John(Scanner stdin){
    System.out.print("Midterm 1 score for John: ");
    double midterm1John = stdin.nextDouble();
    System.out.print("Midterm 2 score for John: ");
    double midterm2John = stdin.nextDouble();
    System.out.print("Exam final score for John: ");
    double finalJohn = stdin.nextDouble();
    double averageJohn = (midterm1John + midterm2John + finalJohn) / 3;
    System.out.println("The average for John is "+ averageJohn);
  }
       // Exam scores for Jane
  public static void Jane(Scanner stdin){
    System.out.print("Midterm 1 score for Jane: ");
    double midterm1Jane = stdin.nextDouble();
    System.out.print("Midterm 2 score for Jane: ");
    double midterm2Jane = stdin.nextDouble();
    System.out.print("Exam final score for Jane: ");
    double finalJane = stdin.nextDouble();
    double averageJane = (midterm1Jane + midterm2Jane + finalJane) / 3;
    System.out.println("The average for Jane is " +averageJane);
  }

   // Exam scores for Jim
  public static void Jim(Scanner stdin){
    System.out.print("Midterm 1 score for Jim: ");
    double midterm1Jim = stdin.nextDouble();
    System.out.print("Midterm 2 score for Jim: ");
    double midterm2Jim = stdin.nextDouble();
    System.out.print("Exam final score for Jim: ");
    double finalJim = stdin.nextDouble();
    double averageJim = (midterm1Jim + midterm2Jim + finalJim) / 3;
    System.out.println("The average for Jim is "+averageJim);
  }

}