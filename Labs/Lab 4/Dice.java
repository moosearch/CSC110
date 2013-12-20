public class Dice{

	public static void main(String [] args){
		roll(6, 1);
	}

	//Prints a random number between start and sides, inclusive
	public static void roll(int sides, int start){
		double zeroToOne = Math.random();
		double zeroToSides = zeroToOne * sides;
		//The casting to an int will cut off any decimal
		int value = (int) (zeroToSides + start);
		System.out.println(value);
	}
}

/*
You should be testing (save, compile and run) throughout these steps:
	1) Test the program to ensure the method works (it does, but test anyway)
	2) Import Scanner, at the top of the file, outside of the class
	3) Make a new Scanner in main, that takes System.in (keyboard input)
	4) Print out a prompt for the user "How many sides?"
	5) Collect an int with the Scanner with nextInt() for the number of sides
	6) Print out a prompt for the user "What is the lowest number on the dice?"
	7) Collect an int with the Scanner for the starting value
	8) Call the roll method with the ints that were retrieved from the keyboard (with Scanner in steps 5 and 7) as parameters
*/
