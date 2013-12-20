//Import the library containing Scanner class
import java.util.*;

public class TryAgain {

  public static void main (String []args)
  {
    // declare a scanner variable call it keyIn
    Scanner keyIn = new Scanner(System.in);

    //Create a prompt for what is wanted
    String prompt = "Enter a score between 0 and 100";
    double hi = 100.0;
    double lo = 0.0;
    double score = 0.0;

    score = getNextScore(keyIn, prompt, hi, lo);
    if(score >= 0.0)
    {
      System.out.println("The score entered is: "+ score);
    } else {
      System.out.println("invalid score program ends.");
    }
    keyIn.close();
  }

  /*  stub getNextScore.
  */
  public static double getNextScore(Scanner in, String prompt,
                    double hi, double lo)
  {
    // prompt the user for a maximum three times to enter
    // a value within the range lo - hi.  For a value within
    // range return that values else return -1.0
    System.out.print(prompt+": ");
      return 0.0;

  }
}

