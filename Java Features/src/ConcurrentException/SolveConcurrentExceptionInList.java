package ConcurrentException;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SolveConcurrentExceptionInList {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);list.add(3);list.add(5);list.add(2);list.add(4);
		Iterator<Integer> iterate = list.iterator();
		while(iterate.hasNext()) {
			Integer i = iterate.next();
			System.out.println(i);
			if(i == 5) {
				list.add(3,6);
			}
		}
		System.out.println(list);
	}
}
