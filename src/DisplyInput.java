import java.util.Scanner;

public class DisplyInput {

	public static void main(String[] args) {

		System.out.println("Welcome To the Display program !!"); // first line in console
		
		System.out.println("Please Enter anything.");// Start of user interaction
		
		System.out.println("What would you like to say: ");
		Scanner userInput = new Scanner(System.in); // gets the users input
		
		
		try {
			while (userInput.hasNext() == true) {
				System.out.print(userInput.next() + " "); // loops through the input and prints it
			}	
		} finally {
			userInput.close(); // close scanner

		}
	}

}
