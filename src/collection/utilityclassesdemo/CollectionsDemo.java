package collection.utilityclassesdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Dipak");
		l.add("Kiran");
		l.add("Dipak");
		l.add("Sham");
		l.add("Vijay");
		l.add("Vinod");
		l.add("Rupesh");
		l.add("Chetan");
		System.out.println("Before sorting");
		System.out.println(l);
		//Collections.sort(l, new MyComparaterSort());
		Collections.sort(l);
		System.out.println("After sorting");
		System.out.println(l);
		
		System.out.println("Binary Serch = "+Collections.binarySearch(l, "Chetan"));
		
		
		List<String> l2 = new ArrayList<>();
		l2.add("Dipak");
		l2.add("Kiran");
		l2.add("Dipak");
		l2.add("Sham");
		l2.add("Vijay");
		l2.add("Vinod");
		l2.add("Rupesh");
		l2.add("Chetan");
		
		
		System.out.println("====================---Reverse The List---======================");
		System.out.println("================--Before Reverse--=====================");
		System.out.println(l2);
		Collections.reverse(l2);		
		System.out.println("================--After Reverse--=====================");
		System.out.println(l2);
		
		Comparator comparator = Collections.reverseOrder(new MyComparaterSort());		
		Collections.sort(l2,comparator);
		System.out.println(l2);
		
	}

}

class MyComparaterSort implements Comparator<Object> {
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return -s1.compareTo(s2);
	}

}
