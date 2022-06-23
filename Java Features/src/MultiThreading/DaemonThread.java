package MultiThreading;

public class DaemonThread {
	public static void main(String[] args) throws InterruptedException{
		Thread thread = new Thread(){
			public void run() {
				for(int i=0; i<5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		};
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(3000);
		System.out.println("Thread : "+Thread.currentThread().getName());
	}
}
