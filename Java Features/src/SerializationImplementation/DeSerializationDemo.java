package SerializationImplementation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("/Users/Lenovo/OneDrive/Desktop/Java Notes/Emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp);
	}

}
