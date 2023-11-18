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
//  d)min(Comparator c)
//  e)max(Comparator c)
//  f)foreEach()
//  g)toArray()
public class StreamsDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(10);
		list.add(5);
		list.add(15);
		list.add(20);
		list.add(25);
		
		System.out.println("Original List");
		System.out.println(list);
		
		Integer min = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum Value : "+min);
		
		Integer max = list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println("Minimum Value : "+max);
		
		System.out.println("===============================");
		System.out.println("Original List");
		System.out.println(list);
		
		System.out.println("After Converting the list to Integr array using the toArray()");
		Integer[] array= list.stream().toArray(Integer[]::new);
		 
		for(Integer i:array)  System.out.println(i);		
		System.out.println("===============================");		
		ArrayList<String> slist = new ArrayList<String>();
		slist.add("diapk");
		slist.add("kiranDeore");
		slist.add("vinodBagul");
		slist.add("rupesh");
		slist.add("akashKumar");
		slist.add("AkashJoshi");
		
		System.out.println("Printing the list of names using forEach Method");
		slist.stream().forEach(s->System.out.println(s));
		
		System.out.println("Printing the list of names using forEach Method using method reference");
		slist.stream().forEach(System.out :: println);	
		 
	}
}
