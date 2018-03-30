// user input library
import java.util.Scanner;

// blue print for our program
public class HelloWorld {
	
	static double myPI = 3.14149; // class variable - accessible from other classes
	
	public static void main(String[] args) {
		
		int d = 5;
//		tryToChange(d);
		
		System.out.println("main d = " + tryToChange(d));
		
	}
	
	public static int tryToChange (int d) {
		
		d = d + 1;
		System.out.println("tryToChange d = " + d);
		
		return d;
		
	}
	
	
	
}