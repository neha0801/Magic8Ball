import java.util.*;
import java.util.Scanner;

public class MyApp
{
	public static void main ( String[] args )
	{
		// creating a object of Random
		Random r = new Random();
		// create an object of Magic8Ball class
		Magic8Ball magBall = new Magic8Ball();
		
		// variable for user input
		String userInput ="";
		// scanner object created
		Scanner keyboard = new Scanner(System.in);
		
		// run the loop till user says wants to continue
		while (magBall.getUserChoice().equalsIgnoreCase("y"))
		{
			// prompt user for a question
			System.out.println("Whats your Question? ");
			// get the 
			userInput = keyboard.nextLine();
			// The random number range is 1 to 20
			int choice = 1 + r.nextInt(20);
			
			// call the method to get the response to the question asked
			magBall.getMagicAnswer(choice);

			// whether user wants history or not
			if (userInput.equalsIgnoreCase("history")){
				// if user wants history loops runs for all questions and displays all questions and answers
				for(int i =0;i<magBall.getQuestions().size();i++){
					// display questions
					System.out.println("Question #" + (i+1) + ":\t" + magBall.getQuestions().get(i));
					// display answers
					System.out.println("Answer #" + (i+1) + ":\t" + magBall.getAnswers().get(i));
				}
			}else {
				// user enters a question then adds to the Question list
				magBall.getQuestions().add(userInput);
				// response to the question is saved in answers list list
				magBall.getAnswers().add(magBall.getResponse());

			}
			// print out the answer to the quesytion
			System.out.println( "MAGIC 8-BALL SAYS: \t" + magBall.getResponse() );
			
			// prompt whether user wants to continue or not
			System.out.println("Do you wish to continue? (y/n): ");
			magBall.setUserChoice(keyboard.nextLine());
		}
		
		// close the scanner
		keyboard.close();
		System.out.println( "Good Bye :-) " );
	}
}