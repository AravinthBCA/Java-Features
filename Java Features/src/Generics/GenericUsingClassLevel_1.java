package Generics;

class ClassLevel1<T extends Runnable>{
//	class ClassLevel1<T extends Runnable&Comparable>{ // mutiple extends class
	T obj;
	ClassLevel1(){
		System.out.println(obj);
	}
}

class MyClass extends Thread implements Comparable<String>{
	@Override
	public int compareTo(String o) {
		return 0;
	}
}

public class GenericUsingClassLevel_1 {

	public static void main(String[] args) {
		ClassLevel1<Thread> obj = new ClassLevel1();
		ClassLevel1<Runnable> obj1 = new ClassLevel1();
//		ClassLevel1<String> obj2 = new ClassLevel1(); // it throw because String class not extends
// thread class but in Runnable extends the Thread...
		
		ClassLevel1<MyClass> obj3 = new ClassLevel1(); // it works only multiple generic extends
	}

}
