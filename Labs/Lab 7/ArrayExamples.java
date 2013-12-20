import java.io.*;
import java.util.*;

public class ArrayExamples
{
	public static void main(String [] args)throws IOException
		{
			System.out.println("Test Arrays ...");
			int size = 5;

			//Define array1 as an array of int
			//Initialize the values
			int [] array1 = { 1, 2, 3, 4, 5};
			printArray(array1);

			//Define array2 as an array of doubles
			//Read these doubles from the keyboard
			double [] array2 = new double[size];
			Scanner input = new Scanner(System.in);
			initArray(input, array2);
			printArray(array2);

			Scanner inFile = new Scanner(new File("inputStrings.txt"));

			//Declare array3
			String [] array3;

			//Get size from file (first line should contain an int: how many Strings)
			int count = inFile.nextInt();
			inFile.nextLine(); // dispose of the rest of line
			//Define array size
			array3 = new String[count];

			//Write a method for printing an array of Strings
			//then you can uncomment these lines
			//initArray(inFile, array3);
			//printArray(array3);

			//Declare array in main but generate array in method
			double [] array4 = initArray(1000);
			//Uncomment the next line to print this enormous array:
			//printArray(array4);

	}

	/*	initArray given a Scanner and a double array gets
		double into each element of the array
	*/
	public static void initArray(Scanner in, double [] a)
	{
		for(int i = 0; i< a.length; i++)
		{
			System.out.println("Enter a double");
			a[i] = in.nextDouble();
		}
	}

	/*	initArray given a Scanner and a String array
		gets the size of the array from the file and
		gets a String into each element of the array
	*/
	public static void initArray(Scanner in, String [] a)
	{
		for(int i = 0; i< a.length; i++)
		{
			a[i] = in.next();
		}
	}

	public static double [] initArray(int size)
	{
		double [] temp = new double[size];
		for (int i=0; i<size; i++)
		{
			temp[i] = Math.sin(i);
		}
		return temp;
	}

	/*	printArray given an array of int prints it
	*/
	public static void printArray(int [] a)
	{
		for(int i = 0; i< a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	/*	printArray given an array of double prints it
	*/
	public static void printArray(double [] a)
	{
		for(int i = 0; i< a.length; i++)
		{
			if (i % 3 == 0)
				System.out.println();
			System.out.print(a[i] + "\t");
		}
	}
}