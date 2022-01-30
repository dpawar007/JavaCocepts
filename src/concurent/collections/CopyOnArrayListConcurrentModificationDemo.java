package concurent.collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListConcurrentModificationDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l); //[A, B, C, D]
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
		String s = (String)itr.next();
		if (s.equals("D"))
		itr.remove();
		}
		System.out.println(l); //RE: java.lang.UnsupportedOperationException
	}

}
