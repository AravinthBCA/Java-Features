package SynchronizationMultiThreading;

class Demo1 extends Thread{
	public void message() throws InterruptedException {
		System.out.println("Thread Name : "+Thread.currentThread().getName());
		synchronized(this) {
			System.out.println("Thread started : "+Thread.currentThread().getName());
			this.sleep(1000);
			System.out.println("Thread Ended : "+Thread.currentThread().getName());
		}
	}
	public void run() {
		try {			message();    }
		catch (InterruptedException e) { e.printStackTrace(); }
	}
}

public class SynchronizationBlock {
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		Thread thread1 = new Thread(obj);
		Thread thread2 = new Thread(obj);
		thread1.start();
		thread2.start();
	}
}
