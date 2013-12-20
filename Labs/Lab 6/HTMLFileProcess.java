import java.util.*;
import java.io.*;

/*
 Ensure that the file horoscopes.html is in the same directory
 as this java file!
*/
public class HTMLFileProcess{

	/* Reads in a file line by line, adding an HTML break after each line
	 then prints each line to standard output for copying into an HTML file.
	 Result may need small edits due to the size of the output screen. */
	public static void main(String [] args) throws FileNotFoundException{

		File filein = new File("horoscopes.html");
		Scanner input = new Scanner(filein);

		String contents = "";
		while( input.hasNext() ){
			contents = input.nextLine();
			System.out.println(contents);
			System.out.println("<br/>");
		}
	}
}