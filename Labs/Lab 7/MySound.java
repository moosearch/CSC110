/**
 * File: MySound.java
 *
 * Description:
 *		Program Shell for the Sound Assignment
 *
 * Requires media.jar and two_second.au
 * in the same directory as this file
 *
 * Compiles with the following command:
 *
 * javac -classpath media.jar;. MySound.java
 *
 * Runs with:
 *
 * java -classpath media.jar;. MySound
 *
 * For Mac computers replace the semicolon (;) with a colon (:)
 **/
public class MySound
{
	public static void main( String [] args )
	{

		// Get sound in from specified .au file.
		Sound sound0 = new Sound( "two_second.au" );

		//COPY THE TWO METHODS FROM THE ASSIGNMENT 6 PDF
		//FIX THEIR INDENTATION
		//TEST THEM BY COMPILING AND RUNNING
		//THEN UNCOMMENT THE CODE BELOW AND COMPILE, RUN

		//Create array of doubles from sound.
		//double [] samples = getSampleValues(sound0);

		//Here you can change the sound via an array of doubles

		// Convert it back to a sound file
		//sound0 = setSampleValues( sound0, samples );

		// Play it
		System.out.println("About to play sound ...");
		sound0.blockingPlay();
		System.out.println("Finished playing sound");
		System.out.println("Program exit.");
	}

	//---------------------------------------------------
	// Also, write a method to print an array of doubles
	//---------------------------------------------------


	//-------------------------------------------------
	//Write a method which sets the middle third of an
	//array of doubles to 0.0
	//ie {1,2,3,4,5,6,7,8,9} => {1,2,3,0,0,0,7,8,9}
	//-------------------------------------------------
}
