
final class Demo{  // final class and final object you can 
	final int id;  //assign the value only once
	public Demo(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
}

public class ImmutableClass {
	public static void main(String[] args) {
		Demo obj = new Demo(5);
		System.out.println(obj.id);
	}
}
