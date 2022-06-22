package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void ReadFile() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
//		ReadFile();  // you don't want to declare try and catch block means you need specify throws 
					// in main method so it call the default exception handler method...
		try {     
			ReadFile(); 
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found..."); 
		}
	}

}
