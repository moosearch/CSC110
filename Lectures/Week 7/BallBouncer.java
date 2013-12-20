/* Title: Ball Bouncer
 * Purpose:This program lists the height of the bounces of a ball,
  * given a specified initial height.
 *
 */

import java.util.Scanner;

public class BallBouncer {

	public static void main(String[] args) {

		// Initialize the input Scanner and Introduce the program
		Scanner stdin = new Scanner(System.in);
		System.out.println(" B A L L   B O U N C E R");

		//Get initial height
		System.out.print("Input:  Initial ball height (in m) ==> ");
		double height = stdin.nextDouble();
		//initialize counter
		int counter = 0;

		//print out and recalculate height until final height has occurred
		while(height > 0.001) {
			System.out.println("  " + counter + "     " + height);
			height /= 2;
			counter++;
		}
		//System.out.println("  " + counter + "     " + height);

	}

}
