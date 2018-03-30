// user input library
import java.util.*;

// blue print for our program
public class HelloWorld {

	// Java Exceptions
		// java.lang.RunTimeException
			// errors on the developers end, must be caught before compiling
		// java.lang.Exception
			// errors checked by compiler, must be correct in order to compile
		// ArtihmeticException
		// ClassNotFoundException
		// IllegalArgumentException
		// IndexOutOfBoundsException
		// InputMismatchException
		// IOException
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("how old are you?");
		int age = checkValidAge();
		
		if (age != 0) {
			System.out.println("you are " + age + " years old");
		}
		
	}
	
	public static int checkValidAge() {
		
		try {
			return userInput.nextInt();
		}
		
		catch (InputMismatchException e) {
			userInput.next();
			System.out.println("that isn't a whole number");
			return 0;
		}
		
	}
	

		

	
	
}