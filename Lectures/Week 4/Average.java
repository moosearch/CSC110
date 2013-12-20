import java.util.*;

public class Average{

	public static void main (String [] args){

		Scanner stdin = new Scanner(System.in);

		System.out.println("This program calculates the average of 3 scores for 5 students who dont exercise");
		for(int i=1; i<=5;i++){
			System.out.print("Enter midterm 1 score: ");
			double midterm1 = stdin.nextDouble();
			System.out.print("Enter midterm 2 score: ");
			double midterm2 = stdin.nextDouble();
			System.out.print("Enter Final Exam score: ");
			double final1 = stdin.nextDouble();
			average(midterm1,midterm2,final1, i);
		}

	}

	public static void average(double mid1,double mid2,double final1, int student){

		double average = (mid1+mid2+final1)/3;


		System.out.println("The average mark for Student #" + student+ " is " + average);

	}





}