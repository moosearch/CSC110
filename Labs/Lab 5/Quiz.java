import java.util.Scanner;

//INSTRUCTIONS:
// 1) Uncomment the calls to the quizes.
// 2) Compile and run to try the quizes.
// 3) Write your own quiz in the method 'survey'.
public class Quiz{

	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Would you like to take a survey? y/n");
		String response = in.next();
		if( response.equalsIgnoreCase("y") ){
			survey(in);

			//UNCOMMENT TO TRY THE QUIZ EXAMPLES:
			/*
			String classification = mammal(in);
			System.out.println("You are a " + classification);
			*/

			/*
			double score = mathTest(in);
			System.out.println("You got " + score + "%");
			*/
		}else{
			System.out.println("Thanks anyway! Goodbye.");
		}
	}//end main


	public static void survey(Scanner input){

		//-------------------------------------------
		// Make your own questionnaire or quiz here!
		//-------------------------------------------

		//------------------------------------------------------------
		//  If you would like to return a String or int for a result
		//or score, change the method header (ie void -> String)
		//  Otherwise, please print some result inside this method.
		//------------------------------------------------------------
	}

	//Asks questions and determines a classification for living creatures
	public static String mammal(Scanner input){
		System.out.println("Let's classify your species...");
		System.out.println("Were you hatched from an egg? y/n");
		String response = input.next();
		if( response.equalsIgnoreCase("n") ){
			//No: not from an egg
			System.out.println("Have you got hair? y/n");
			response = input.next();
			if( response.equalsIgnoreCase("y") ){
				return "mammal";
			}else{
				return "reptile or microbe";
			}
		}else{
			//Yes: hatched from an egg
			System.out.println("Have you got feathers? y/n");
			response = input.next();
			if( response.equalsIgnoreCase("y") ){
				return "bird";
			}else{
				return "amphibian, reptile or fish";
			}
		}
	}//end mammal

	//Returns the percent score achieved on the math test
	public static double mathTest(Scanner input){
		double numOfQuestions = 3;
		double score = 0.0;

		System.out.println("Time for a Math Quiz...");

		//Question 1
		System.out.println("What is 6 * 7?");
		int answer = input.nextInt();
		if( answer == (6*7) ){
			System.out.println(answer);
			score++;
		}

		//Question 2
		System.out.println("What is 18 / 9?");
		answer = input.nextInt();
		if( answer == (18/9) ){
			System.out.println(answer);
			score++;
		}

		//Question 3
		System.out.println("What is 182 - 97?");
		answer = input.nextInt();
		if( answer == (182 - 97) ){
			System.out.println(answer);
			score++;
		}

		//Calculate % correct
		return (score / numOfQuestions)*100;
	}//end mathTest

}//end the class Quiz