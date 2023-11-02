package collection.cursors;

import java.util.Enumeration;
import java.util.Vector;

//Only used for legacy classes and read operation
public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		for (int i = 0; i <= 10; i++) {
			v.addElement(i);
		}
		System.out.println("Before Enumeration");
		System.out.println(v);
		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			Integer I = e.nextElement();
			if (I % 2 == 0)
				System.out.println(I);
		}
		System.out.println(v);

	}

}
