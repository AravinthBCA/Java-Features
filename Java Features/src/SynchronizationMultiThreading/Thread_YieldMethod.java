package SynchronizationMultiThreading;

class Demo2 extends Thread{
	public void run() {
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		for(int i=0; i<5; i++) {
			System.out.println("Thread Name : "+Thread.currentThread().getName()+" and i Value : "+i);
			if(i==2) {
				Thread.yield();
			}
		}
	}
}
public class Thread_YieldMethod {
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		Thread thread1 = new Thread(obj, "Thread-1");
		thread1.start();
		Thread thread2 = new Thread(obj, "Thread-2");
		thread2.start();
		System.out.println("Finish....");
	}
}
