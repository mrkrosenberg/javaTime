// user input library
import java.io.*;

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
		
		getAFile("./somestuff.txt");
		
	}
	

	public static void getAFile(String fileName)  {
		
		try {
			FileInputStream file = new FileInputStream(fileName);

		} 
		catch(FileNotFoundException e) {
			System.out.println("Sorry can't find that file");
		}
		catch(IOException e) {
			System.out.println("Unknown IO Error");
		}
//		catch(ClassNotFoundException e) {
//			// leave code block blank to ignore an exception
//		}
		catch(Exception e) {
			System.out.println("there was an error");
		}
		
		finally {
			// always executes, used to clean up code block
				// close db connection, closes files, end program
			System.out.println("");
		}
		
	}

	

		

	
	
}