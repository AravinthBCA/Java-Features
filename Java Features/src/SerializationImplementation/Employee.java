package SerializationImplementation;

import java.io.*;

public class Employee implements Serializable{
	int id;
	String name;
	static double salary; // static and transient keyword not allow to serialize the object
	transient int panNumber; //using transient it not write into file or network
	
	Employee(int id,String name,double salary,int panNumber){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.panNumber = panNumber;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", panNumber=" + panNumber + "]";
	}
	
	
}
