package SerializationImplementation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		fos = new FileOutputStream("/Users/Lenovo/OneDrive/Desktop/Java Notes/Emp.ser");
		oos = new ObjectOutputStream(fos);
		
		Employee emp = new Employee(1,"aravinth",10000,12345);
		oos.writeObject(emp);
		System.out.println("Employee Object Serialized...");
	}

}
