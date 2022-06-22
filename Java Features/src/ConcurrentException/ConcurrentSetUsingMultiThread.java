package ConcurrentException;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentSetUsingMultiThread extends Thread{
	static CopyOnWriteArraySet<Integer> list = new CopyOnWriteArraySet<>();
	
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
		ConcurrentSetUsingMultiThread obj = new ConcurrentSetUsingMultiThread();
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
