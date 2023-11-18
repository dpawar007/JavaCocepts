package jdk8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//Stream s = c.stream()
//1>Configuration :- 
//    i> Filter Mechanism 
//   ii> Map Mechanism
//2>Processing :-
//  a)collect()
//  b)count()
//  c)sorted || sorted(Comparator c)

public class StreamsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(10);
		list.add(5);
		list.add(15);
		list.add(20);
		list.add(25);

		System.out.println("ORIGINAL LIST");
		System.out.println(list);
		List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("EVEN ELEMENTS LIST");
		System.out.println(evenList);
		List<Integer> plusList = list.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println("PLUS 5 ELEMENTS LIST");
		System.out.println(plusList);
		
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("diapk");
		slist.add("kiranDeore");
		slist.add("vinodBagul");
		slist.add("rupesh");
		slist.add("akashKumar");
		slist.add("AkashJoshi");
		
		
		 long count = slist.stream().filter(s->s.length()>=9).count();
		 System.out.println("Names length greater than equal 9 : "+count);
		 
		 System.out.println("Original List with insertation order");
		 System.out.println(list);
		 
		 List<Integer> naturalSorting = list.stream().sorted().collect(Collectors.toList());
		 System.out.println("Default natural sorting");
		 System.out.println(naturalSorting);
		 
		 List<Integer> customizedSorting = list.stream().sorted((i1,i2)->  i1>i2?-1:i1<i2?1:0 ).collect(Collectors.toList());
		 System.out.println("Customized sorting");
		 System.out.println(customizedSorting);		 
		 
	}
}
