package concurent.collectiondemo;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetsDemo {

	public static void main(String[] args) {
		CopyOnWriteArraySet s = new CopyOnWriteArraySet();
	  //CopyOnWriteArraySet s = new CopyOnWriteArraySet(Collection c);
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("A");
		s.add(null);
		s.add(10);
		s.add("D");
		System.out.println(s);
	}

}
