public class Dice{

	public static void main(String [] args){
		System.out.println(roll(6, 1));
	}

	//Returns a random number between start and sides, inclusive
	public static int roll(int sides, int start){
		double zeroToOne = Math.random();
		double zeroToSides = zeroToOne * sides;
		//The casting to an int will cut off any decimal
		int value = (int) (zeroToSides + start);
		return value;
	}
}

/*
	1) Test the program to ensure the method works (it does, but test anyway)
	2) Import Scanner, at the top of the file, outside of the class
	3) Make a new Scanner in main, that takes System.in (keyboard input)
	4) Print out a prompt for the user "How many sides?"
	5) Collect an int with the Scanner for the number of sides
	6) Print out a prompt for the user "What is the lowest number on the dice?"
	7) Collect an int with the Scanner for the starting value
	8) Call the roll method with the ints that were retrieved from the keyboard (with Scanner in steps 5 and 7)
	9) Print the output of the roll
	10) You should be testing (save, compile and run) throughout these steps
*/