// user input library
import java.util.Scanner;

// blue print for our program
public class HelloWorld {
	
	static double myPI = 3.14149; // class variable - accessible from other classes
	
	public static void main(String[] args) {
		
//		addThem(1, 2);
		System.out.println(addThem(1, 2));
		
		
	}
	
	
	public static int addThem(int a, int b) {
		
		double smallPI = 3.14; // local variable  - only available in this method
		
//		double myPI = 3.0;
//		myPI = myPI * 3;
//		
//		System.out.println("Local PI " + myPI);
		
		int c = a + b;
		
		return c;
		
	}
	
}