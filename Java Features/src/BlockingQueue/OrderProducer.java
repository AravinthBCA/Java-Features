package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable{

	private BlockingQueue<String> queue;
	
	public OrderProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			queue.add("apple");
			Thread.sleep(1000);
			queue.add("samsung");
			Thread.sleep(1000);
			queue.add("oneplus");
			Thread.sleep(1000);
			queue.add("oppo");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
