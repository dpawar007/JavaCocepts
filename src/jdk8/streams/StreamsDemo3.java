package jdk8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
//  h)Stream.of()  we can also apply stream concept for group of values and arrays
public class StreamsDemo3 {

	public static void main(String[] args) {
		// For group of values
		Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
		s.forEach(System.out::println);

		// for Arrays
		Double[] d = { 10.0, 10.1, 10.2, 10.3, 10.4 };
		Stream<Double> a = Stream.of(d);
		a.forEach(System.out::println);

	}
}
