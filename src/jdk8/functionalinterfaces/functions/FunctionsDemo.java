package jdk8.functionalinterfaces.functions;

import java.util.function.Function;

//Performed certain operation and to return some result.
public class FunctionsDemo {
	public static void main(String[] args) {
		Function<String, Integer> function = s -> s.length();
		System.out.println("Length of dipak string: " + function.apply("diapk"));
		System.out.println("Length of durgaSoft string : " + function.apply("durgaSoft"));

		Function<Integer, Integer> f = i -> i * i;
		System.out.println("Square of 2: " + f.apply(2));
		System.out.println("Square of 5: " + f.apply(5));
	}
}