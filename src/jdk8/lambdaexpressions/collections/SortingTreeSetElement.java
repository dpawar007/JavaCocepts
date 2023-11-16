package jdk8.lambdaexpressions.collections;

import java.util.TreeSet;

public class SortingTreeSetElement {

	public static void main(String[] args) {
	 //TreeSet<Integer> ts = new TreeSet<Integer>((s1, s2) ->  -s1.compareTo(s2));
		TreeSet<Integer> ts = new TreeSet<Integer>((s1, s2) -> (s1 > s2) ? -1 : (s1 < s2) ? 1 : 0); 
		ts.add(5);
		ts.add(7);
		ts.add(35);
		ts.add(2);
		ts.add(16);
		ts.add(27);		
		System.out.println(ts);
	}

}
