package SynchronizationMultiThreading;

class DisplayMessage extends Thread{
	public synchronized void message() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void run() {
		message();
	}
}

public class SynchronizationMethod {
	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();
		Thread thread1 = new Thread(dm);
		Thread thread2 = new Thread(dm);
		thread1.start();
		thread2.start();
	}
}
