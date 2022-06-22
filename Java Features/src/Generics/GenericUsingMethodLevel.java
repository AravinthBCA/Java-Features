package Generics;

import java.util.ArrayList;

public class GenericUsingMethodLevel {
	
	public static <T> void sample(ArrayList<T> list) {
		System.out.println(list);
	}
	
	public static <T> void sample_1(T obj) {
		System.out.println(obj.getClass());
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> listInteger = new ArrayList<>();
		listInteger.add(5);
		sample(listInteger);
		
		ArrayList<String> listString = new ArrayList<>();
		listString.add("Aravinth");
		sample(listString);
		
		sample_1(5);
		sample_1(5550.50);
		sample_1("Aravinth");
	}
}
