// Purpose: To demonstrate repetitive code!
import java.util.*;

public class ScannerEx {
  // method main(): application entry point
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);

    // Exam scores for John
    double midterm1John = stdin.nextDouble();
    double midterm2John = stdin.nextDouble();
    double finalJohn = stdin.nextDouble();
    double averageJohn = (midterm1John + midterm2John + finalJohn) / 3;

       // Exam scores for Jane
    double midterm1Jane = stdin.nextDouble();
    double midterm2Jane = stdin.nextDouble();
    double finalJane = stdin.nextDouble();
    double averageJane = (midterm1Jane + midterm2Jane + finalJane) / 3;

   // Exam scores for Jim
    double midterm1Jim = stdin.nextDouble();
    double midterm2Jim = stdin.nextDouble();
    double finalJim = stdin.nextDouble();
    double averageJim = (midterm1Jim + midterm2Jim + finalJim) / 3;
}

}