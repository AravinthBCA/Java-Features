package MultiThreading;

public class ThreadGetNameAndSetName extends Thread implements Runnable{
	public void run() {
		System.out.println("Thread Name : "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		ThreadGetNameAndSetName obj = new ThreadGetNameAndSetName();
		obj.setName("Thread");
		obj.start();
		
		Runnable runnable = new ThreadGetNameAndSetName();
		Thread thread = new Thread(runnable);
		thread.setName("Runnable");
		thread.setPriority(MAX_PRIORITY);
		thread.start();
		
		Thread current = Thread.currentThread();
		current.setName("Main");
		System.out.println("Thread Main Name : "+current.getName());
	}
}
