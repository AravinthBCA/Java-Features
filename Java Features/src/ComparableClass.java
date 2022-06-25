import java.util.*;
import java.io.*;

public class ComparableClass {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ruban");
		list.add("aravinth");
		list.add("aand");
		list.add("aaa");
		list.add("aab");
		Collections.sort(list);  // default sorting
		System.out.println(list);
		Collections.reverse(list); //descending order
		System.out.println(list); 
	}
}
