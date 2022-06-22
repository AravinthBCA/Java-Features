package Generics;

import java.util.ArrayList;

public class GenericWildCardUsingMethodLevel {
	
	public static void sample(ArrayList<?> list) {
		list.add(null);
//		list.add(6); // wildcard allow only null object
		System.out.println(list);
	}
	
	public static void sample1(ArrayList<? super Integer> list) {
		list.add(null);
//		list.add(new Runnable()); // wildcard allow only null 
		System.out.println(list);
	}
	
	public static void sample2(ArrayList<? extends Number> list) {
		list.add(null);
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(5);integerList.add(7);integerList.add(6);
		sample(integerList);
		
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("aravinth");stringList.add("ruban");stringList.add("deepak");
		sample(stringList);
		
		sample1(integerList);
		sample2(integerList);
//		sample1(stringList); // it throw error because it only Integer class objects
//		sample2(stringList); // it throw error because it only Integer class objects
		
	}
}
