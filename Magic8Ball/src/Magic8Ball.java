import java.util.ArrayList;
import java.util.List;


public class Magic8Ball {
	
	private List<String> questions;
	private List<String> answers;
	private String response;
	private String userChoice;
	
	public Magic8Ball(){
		this.userChoice="y";
		this.response ="";
		this.questions = new ArrayList<String>();
		this.answers= new ArrayList<String>();
	}
	
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getUserChoice() {
		return userChoice;
	}
	public void setUserChoice(String userChoice) {
		this.userChoice = userChoice;
	}
	public List<String> getQuestions() {
		return questions;
	}
	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	/**
	 * method to get the correct response based on the random number generated
	 * @param choice
	 */
	public void getMagicAnswer(int choice)
	{
		if (choice == 1 )
			this.setResponse("It is certain");
		else if ( choice == 2 )
			this.setResponse("It is decidedly so");
		else if ( choice == 3 )
			this.setResponse("Without a doubt");
		else if ( choice == 4 )
			this.setResponse("Yes - definitely");
		else if ( choice == 5 )
			this.setResponse("You may rely on it");
		else if ( choice == 6 )
			this.setResponse("As I see it, yes");
		else if ( choice == 7 )
			this.setResponse("Most likely");
		else if ( choice == 8 )
			this.setResponse("Outlook good");
		else if ( choice == 9 )
			this.setResponse("Signs point to yes");
		else if ( choice == 10 )
			this.setResponse("Yes");
		else if ( choice == 11 )
			this.setResponse("Reply hazy, try again");
		else if ( choice == 12 )
			this.setResponse("Ask again later");
		else if ( choice == 13 )
			this.setResponse("Better not tell you now");
		else if ( choice == 14 )
			this.setResponse("Cannot predict now");
		else if ( choice == 15 )
			this.setResponse("Concentrate and ask again");
		// added 5 extra options for random answers
		else if ( choice == 16 )
			this.setResponse("Don't count on it");
		else if ( choice == 17 )
			this.setResponse("My reply is no");
		else if ( choice == 18 )
			this.setResponse("My sources say no");
		else if ( choice == 19 )
			this.setResponse("Outlook not so good");
		else if ( choice == 20 )
			this.setResponse("Very doubtful");
		else 
			this.setResponse("8-BALL ERROR!");
	}
}
