import java.util.*;
import java.io.*;

public class ScannerHasNextMethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the Number : ");
		while(in.hasNextInt()) {
			sum += in.nextInt();
		}
		System.out.println("Sum is : "+sum);
	}

}
