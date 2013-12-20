// Purpose: To demonstrate repetitive code!
import java.util.*;

public class Lecture10 {
  // method main(): application entry point
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
	int sum=0;
	int product=1;
	int inputNumber=stdin.nextInt();

	while(inputNumber!=0){
		sum = sum + inputNumber;
		product = product * inputNumber;
		inputNumber=stdin.nextInt();
	}

	System.out.println("The sum is " + sum);
	System.out.println("The product is " + product);

}

}