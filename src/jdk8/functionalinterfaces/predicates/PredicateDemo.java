package jdk8.functionalinterfaces.predicates;

import java.util.Scanner;
import java.util.function.Predicate;

//Introduce in JDK 8.0
//It is a functional Interface
//It contains only one method is public boolean test(T t){}
public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> predicate = I -> I > 10;
		System.out.println(predicate.test(100));
		System.out.println(predicate.test(7));
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		Integer no =  sc.nextInt();
		Predicate<Integer> p = I -> I>20;
		System.out.println("Result : " + p.test(no)); 		
	}
}