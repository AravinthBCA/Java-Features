package Generics;

class ClassLevel<T> {
	
	T obj;
	
	ClassLevel(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return obj;
	}
}

public class GenericUsingClassLevel {

	public static void main(String[] args) {
		ClassLevel<Integer> intObj = new ClassLevel<>(5);
		System.out.println(intObj.getObject());
		
		ClassLevel<Double> doubleObj = new ClassLevel<>(555.50);
		System.out.println(doubleObj.getObject());

		ClassLevel<String> stringObj = new ClassLevel<>("aravinth");
		System.out.println(stringObj.getObject());
	}

}