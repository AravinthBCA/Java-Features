package ConcurrentException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class MapConcurrentException extends Thread{
	
	static HashMap<Integer,String> list = new HashMap<>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		list.put(6,"sankar");
	}
	
	public static void main(String[] args) throws InterruptedException {
		MapConcurrentException obj = new MapConcurrentException();
		obj.start();
		list.put(1,"aravinth");list.put(2,"ruban");list.put(5,"mani");list.put(3,"deepak");
		Iterator<Integer> iterator = list.keySet().iterator();
		while(iterator.hasNext()) {
			Thread.sleep(2000);
			System.out.println(list.get(iterator.next()));
		}
		System.out.println(list);
	}
}
