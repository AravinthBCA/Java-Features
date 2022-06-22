package SynchronizationMultiThreading;

import java.util.*;
import java.io.*;

public class Thread_JoinMethod extends Thread{
	static int n,sum=0;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter a value : ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		Thread_JoinMethod thread = new Thread_JoinMethod();
		thread.start();
		thread.join(); //without this line the user created thread goes to run method and main thread goes sysout direct so
//without calculating the sum it print the output using Join method main thread wait until the user created thread finish...
		System.out.println("Sum of Number is : "+sum);
	}
	public void run() {
		for (int i = 0; i < n; i++) {
			sum +=i;
		}
	}
}
