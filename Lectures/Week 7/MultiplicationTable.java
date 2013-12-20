import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// Initialize the input Scanner and Introduce the program
		Scanner stdin = new Scanner(System.in);
		System.out.println(" M U L T I P L I C A T I O N    T A B L E");

		makeMultiplicationTable(stdin);
	}

	public static void makeMultiplicationTable (Scanner standardIn) {

		//Get two values
		System.out.println("Input: ");
		System.out.print("  X ==> ");
		int X = standardIn.nextInt();
		System.out.print("  Y ==> ");
		int Y = standardIn.nextInt();

		//Make the multiplication table
		for (int counterX = 1; counterX <= X; counterX++) {
			for (int counterY = 1; counterY <=Y; counterY++) {
				System.out.print(counterX + " x " + counterY );
				System.out.println(" = " + counterX * counterY);
			}
		}

	}

}
