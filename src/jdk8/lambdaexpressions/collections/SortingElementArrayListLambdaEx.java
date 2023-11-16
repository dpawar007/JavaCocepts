package jdk8.lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingElementArrayListLambdaEx {
	  static Comparator<Integer> comparator = (s1, s2) -> (s1 > s2) ? -1 : (s1 < s2) ? 1 : 0;
	// static Comparator<Integer> comparator = (s1, s2) ->  -s1.compareTo(s2);
	  //static Comparator<Integer> comparator = (s1, s2) ->  1;
	   //static Comparator<Integer> comparator = (s1, s2) ->  -1;

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(77);
		al.add(43);
		al.add(6);
		al.add(12);
		al.add(20);
		System.out.println("Before Sorting");
		System.out.println(al);
	//Collections.sort(al, comparator);
    //Collections.sort(al,(s1, s2) -> (s1 > s2) ? -1 : (s1 < s2) ? 1 : 0);
	    Collections.sort(al,(s1, s2) ->  -s1.compareTo(s2));
		System.out.println("After Sorting");
		System.out.println(al);
	}

}
