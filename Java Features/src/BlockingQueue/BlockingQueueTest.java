package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
		OrderProducer producer = new OrderProducer(queue);
		OrderConsumer consumer = new OrderConsumer(queue);
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}
