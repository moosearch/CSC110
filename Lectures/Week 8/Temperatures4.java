import java.io.*;    // for File
import java.util.*;  // for Scanner

public class Temperatures4 {
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("weathers2.txt"));
        double prev = input.nextDouble();   // fencepost
        String garb = "";
        while(input.hasNext()) {
            if(input.hasNextDouble()){
            	double next = input.nextDouble();
            	System.out.println(prev + " to " + next +
                    ", change = " + (next - prev));
            	prev = next;
			}else{
				garb += input.next();
			}
        }
        System.out.println(garb);
    }
}
