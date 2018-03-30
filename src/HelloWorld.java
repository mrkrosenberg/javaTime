// user input library
import java.util.Scanner;

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

	public static void main(String[] args) {
		
		divideByZero(2);
		
	}
	
	public static void divideByZero(int a) {
		
		try {
			
			System.out.println(a/0);
			
		}
		
		catch (ArithmeticException e) {
			
			// prints custom error message
			System.out.println("Your math sucks!");
			
			// prints error in the code
			System.out.println(e.getMessage());
			
			// prints exception name and error message
			System.out.println(e.toString());
			
			// prints specific error
			e.printStackTrace();
			
		}
		
	}
	
	
}