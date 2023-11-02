package collection.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

//Only used for List Objects, Bi-Directional Cursor and read operation,removed operation,add operation,replace operation
public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>();
		l.add("Baala");
		l.add("Venki");
		l.add("Chiru");
		l.add("Naag");
		System.out.println(l);
		ListIterator<String> ltr = l.listIterator();
		while (ltr.hasNext()) {
			String s = (String) ltr.next();
			if (s.equals("Venki"))
				ltr.remove();
			if (s.equals("Naag"))
				ltr.add("Chaitu");
			if (s.equals("Chiru"))
				ltr.add("Charan");
		}
		System.out.println(l);

	}

}
