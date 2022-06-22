package ConcurrentException;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapUsingMultiThread extends Thread{
	
	static ConcurrentHashMap<Integer,String> list = new ConcurrentHashMap<>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		list.put(6,"sankar");
		System.out.println(list);
	}
	
	public static void main(String[] args) throws InterruptedException {
		ConcurrentMapUsingMultiThread obj = new ConcurrentMapUsingMultiThread();
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
