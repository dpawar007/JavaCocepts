package collection.cursors;

import java.util.ArrayList;
import java.util.Iterator;

//Only used all collection classes Universal cursor and read operation,removed operation
public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			l.add(i);
		}
		System.out.println("Before Using the iterator");
		System.out.println(l);
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			Integer I = itr.next();
			if (I % 2 == 0)
				System.out.println(I);
			else
				itr.remove();
		}
		System.out.println(l);

	}

}
