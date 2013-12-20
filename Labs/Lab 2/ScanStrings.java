/*	Scanner Example program:  ScanStrings
	Defining a Scanner object gives you access to reading from the 
	keyboard and making your programs more interactive.  In this case
	we scan everything that is tyed as a String.  The program identifies
	a String as anything separated by white space (spaces, tabs and end of lines)
*/

// Scanner exists in the Java util library
// Import the whole library is imported as in import java.util.*
// or just the class you are interested in as we do here.

import java.util.Scanner;

public class ScanStrings
{
	public static void main(String [] args)
	{
		String message;
		String input = "";
		System.out.println("program starts ...");
		
		// define a Scanner variable, user chosen name
		// System.in is the java file name for the system's standard
		// in which defaults to the keyboard.
		
		Scanner keysIn = new Scanner(System.in);
		
		message =   "THIS IS A PROGRAM TO DEMONSTRATE USER \n" +
					"INTERACTION.  ALTHOUGH THE VALUES INPUT MUST \n" +
					"BE CAPTURED IN CONTAINERS OF THE RIGHT TYPE \n" +
					"THIS PROGRAM CAPTURES EVERYTHING AS A STRING \n" +
					"\n\n" +
					"Enter any number of words. Enter the word stop to stop";

		System.out.println(message);
		while(!(input.equals("stop")))
		{
			input = keysIn.next();
			System.out.print(input + " ");
		}
		System.out.println(); 
		keysIn.close();
	}	
}