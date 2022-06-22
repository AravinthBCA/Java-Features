package ConcurrentException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetConcurrentException extends Thread{
	
	static HashSet<Integer> list = new HashSet<>();
	
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
		SetConcurrentException obj = new SetConcurrentException();
		obj.start();
		list.add(1);list.add(2);list.add(5);list.add(3);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Thread.sleep(2000);
			System.out.println(iterator.next());
		}
		System.out.println(list);
	}
}
