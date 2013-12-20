import java.io.*;
import java.util.*;

public class QuoteMessage {
  public static void main(String[] args)
         throws FileNotFoundException {
     Scanner input = new Scanner(new File("input.txt"));
     while (input.hasNextLine()) {
        String line = input.nextLine();
        System.out.println(">" + line);
     }
  }
}
