import java.util.*;
import java.io.*;

class Student implements Comparator<Student>,Comparable<Student>{
	int rollno;
	String name;
	int age;
	Student(){}
	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student st) { // ascending order
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
	@Override
	public int compare(Student o1, Student o2) { // descending order
		 if(o1.age==o2.age)    
			 return 0;    
			 else if(o1.age<o2.age)    
			 return 1;    
			 else    
			 return -1; 
	}
}
public class ComparableClass_1 {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		Collections.sort(al);  // comparable
		for(Student st:al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}
		System.out.println("-----------------------------");
		Collections.sort(al,new Student());  // comparator
		for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}
}
