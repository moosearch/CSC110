// Purpose: To demonstrate repetitive code!
import java.util.*;

public class Lecture10b{
	// method main(): application entry point
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
	int sum=0;
	int product=1;
	int inputNumber;

	do{
		inputNumber=stdin.nextInt();
		sum = sum + inputNumber;
		if(inputNumber!=0){
			product = product * inputNumber;
		}
	}while(inputNumber!=0);

	System.out.println("The sum is " + sum);
	System.out.println("The product is " + product);

}

}