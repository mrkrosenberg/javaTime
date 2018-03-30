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
		
		try {
			getAFile("./somestuff.txt");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	

	public static void getAFile(String fileName) throws IOException, FileNotFoundException {
	
		FileInputStream file = new FileInputStream(fileName);
		
	}

	

		

	
	
}