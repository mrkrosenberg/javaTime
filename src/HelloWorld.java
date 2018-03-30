// user input library
import java.util.Scanner;

// blue print for our program
public class HelloWorld {
	
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int randomNumber = (int) (Math.random() * 50);
		
		if (randomNumber < 25) {
			System.out.println("The random number is less than 25");
		}
		System.out.println("The random number is " + randomNumber);
			
	}
	
	
}