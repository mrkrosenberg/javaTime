// user input library
import java.util.Scanner;

// blue print for our program
public class HelloWorld {
	
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Your favorite number: ");
		
		if (userInput.hasNextInt()) {
			int numEntered = userInput.nextInt();
			System.out.println("you entered " + numEntered);
			
			int numbEnteredTimes2 = numEntered + numEntered;
			System.out.println("your number X 2 = " + numbEnteredTimes2);

			
			
		} else {
			System.out.println("enter an integer next time");
		}
			
	}
	
	
}