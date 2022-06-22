package ConcurrentException;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListUsingMultiThread extends Thread{
	
	static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		list.add(6);
	}
	
	public static void main(String[] args) throws InterruptedException {
		ConcurrentListUsingMultiThread obj = new ConcurrentListUsingMultiThread();
		obj.start();
		list.add(1);list.add(3);list.add(5);list.add(2);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Thread.sleep(2000);
			System.out.println(iterator.next());
		}
		System.out.println(list);
	}
}
