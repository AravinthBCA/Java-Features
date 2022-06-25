import java.util.*;
import java.io.*;

public class ComparatorClass implements Comparator<StringBuffer>{
	
	@Override
	public int compare(StringBuffer o1,StringBuffer o2) { // descending order
		return (o2.toString()).compareTo(o1.toString());
	}
	
	public static void main(String[] args) {
//		TreeSet<StringBuffer> list = new TreeSet<>(); /// default sorting
		TreeSet<StringBuffer> list = new TreeSet<>(new ComparatorClass()); /// comparator sorting
		list.add(new StringBuffer("ruban"));
		list.add(new StringBuffer("aravinth"));
		list.add(new StringBuffer("aand"));
		list.add(new StringBuffer("aaa"));
		list.add(new StringBuffer("aab"));
		System.out.println(list); 
	}}