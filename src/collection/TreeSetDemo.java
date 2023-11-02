package collection;

import java.util.TreeSet;

public class TreeSetDemo {

	 

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
	   //TreeSet t1 = new TreeSet(Comparator c);
		/* Creates an Empty TreeSet Object where all Elements will be Inserted According to
		   Customized Sorting Order which is described by Comparator Object
		 */
	    //TreeSet t = new TreeSet(Collection c);
	    //TreeSet t = new TreeSet(SortedSet s);
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		t.add(new Integer(10));
		/*try {
		t.add(null);
		}catch(ClassCastException  e) {
			System.out.println("ClassCastException");
		}*/
		System.out.println(t);
	}

}
