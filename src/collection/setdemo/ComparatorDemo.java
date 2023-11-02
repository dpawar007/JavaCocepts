package collection.setdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet(new MyIntegerComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);// [20, 15, 10, 5, 0]

		TreeSet<String> s = new TreeSet(new MyStringComparator());
		s.add("Dipak");
		s.add("Kiran");
		s.add("Raman");
		s.add("Sham");
		s.add("Bhaiya");
		s.add("Tarun");
		System.out.println(s);
	}
}

class MyIntegerComparator implements Comparator<Object> {
	@Override
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -1;
		else
			return 0;

//		return i1.compareTo(i2); //[0, 5, 10, 15, 20] Ascending Order
//		return -i1.compareTo(i2); //[20, 15, 10, 5.0] Descending Order
//		return i2.compareTo(i1); //[20, 15, 10, 5.0]
// 		return -i2.compareTo(i1); //[0, 5, 10, 15, 20]
//		return +1; //[10, 0, 15, 5, 20, 20] Insertion Order
//		return -1; //[20, 20, 5, 15, 0, 10] Reverse of Insertion Order
//		return 0; //[10] Only 1 st Inserted Element Present And All Remaining Elements Treated as Duplicates
	}
}

class MyStringComparator implements Comparator<Object> {
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;

//		    return s1.compareTo(s2);  
		    return -s1.compareTo(s2); 
//			return s2.compareTo(s1);  
//	 		return -s2.compareTo(s1);  
//			return +1;  
//			return -1;  
//			return 0;  
	}
}
