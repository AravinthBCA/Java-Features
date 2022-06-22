package ConcurrentException;

import java.util.ArrayList;
import java.util.Iterator;

public class ListConcurrentException {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);list.add(3);list.add(5);list.add(2);list.add(4);
		Iterator<Integer> iterate = list.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
			list.add(6);
		}
	}

}
