import java.io.*;   // for File, FileNotFoundException
import java.util.*;

public class Echo {
    public static void main(String[] args)
    	throws FileNotFoundException{
			File f = new File("numbers.txt");
			Scanner input = new Scanner(f);
			double sum = 0.0;
			for(int i=1;i<=5;i++){
				double next = input.nextDouble();
				System.out.println("number is "+ next);
				sum += next;
			}
			System.out.println("Sum is " + sum);
    }
}