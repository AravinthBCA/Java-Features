package SynchronizationMultiThreading;

class Demo extends Thread{
	public static synchronized void message1() {
		System.out.println("message1 -- "+Thread.currentThread().getName());
	}
	public static synchronized void message2() {
		System.out.println("message2 -- "+Thread.currentThread().getName());
	}
	public synchronized void message3() {
		System.out.println("message3 -- "+Thread.currentThread().getName());
	}		
	public static void message4() {
		System.out.println("message4 -- "+Thread.currentThread().getName());
	}
	public void message5() {
		System.out.println("message5 -- "+Thread.currentThread().getName());
	}
	
	public void run() {
		try {
			Thread.sleep(2000);
			message1();
			Thread.sleep(2000);
			message2();
			Thread.sleep(2000);
			message3();
			Thread.sleep(2000);
			message4();
			Thread.sleep(2000);
			message5();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class SynchronizationClassLevel {
	public static void main(String[] args) {
		Demo obj = new Demo();
		Thread thread1 = new Thread(obj);
		Thread thread2 = new Thread(obj);
		thread1.start();
		thread2.start();
	}
}
