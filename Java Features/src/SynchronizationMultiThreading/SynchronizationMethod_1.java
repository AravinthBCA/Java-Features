package SynchronizationMultiThreading;

class DisplayMessages {
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
}

class Executor extends Thread{
	DisplayMessages dm;
	Executor(DisplayMessages dm2){
		this.dm = dm2;
	}
	public void run() {
		dm.message();
	}
}

public class SynchronizationMethod_1 {
	public static void main(String[] args) {
		DisplayMessages dm = new DisplayMessages();
		Executor thread1 = new Executor(dm);
		Executor thread2 = new Executor(dm);
		thread1.start();
		thread2.start();
	}
}
