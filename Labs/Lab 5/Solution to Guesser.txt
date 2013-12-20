import java.util.Scanner;
public class Guesser{
	public static void main(String [] args){
		int secretNumber = (int) (Math.random() * 101);
		System.out.println("Guesser begins");
		Scanner input = new Scanner(System.in);
		boolean youWon = false;
		int lastGuess;
		int guesses = 7;
		while(!youWon && guesses > 0){
			lastGuess = getGuess(input);
			youWon = winner(lastGuess, secretNumber);
			guesses--;
		}
		if(youWon){
			System.out.println("Win!");
		}else{
			System.out.println("you didn't win this time");
		}
	}
	public static int getGuess(Scanner in){
		System.out.println("Guess!");
		return in.nextInt();
	}
	public static boolean winner(int guess, int secret){
		if(guess < secret)	System.out.println("Higher");
		if(guess > secret)	System.out.println("Lower");
		return guess == secret;
	}
}