package jdk8.functionalinterfaces.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a + b) % 2 == 0;
		System.out.println(biPredicate.test(10, 10));
		System.out.println(biPredicate.test(10, 15));
	}

}
