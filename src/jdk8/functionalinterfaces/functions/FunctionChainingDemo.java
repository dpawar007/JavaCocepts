package jdk8.functionalinterfaces.functions;

import java.util.function.Function;

//Default Methods
//f1.andThen(f2)  f1 will be applied followed by f2
//f1.compute(f2) f2 will be applied followed by f1


//Static Methods
//identity()
public class FunctionChainingDemo {
	public static void main(String[] args) {
		Function<String, String> f1 = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 9);
		System.out.println("Result of f1 : " + f1.apply("AishwaryaBhabi"));
		System.out.println("Result of f2 : " + f2.apply("AishwaryaBhabi"));
		System.out.println("Result of f1&f2 : " + f1.andThen(f2).apply("AishwaryaBhabi"));
		System.out.println("Result of f2&f1 : " + f1.compose(f2).apply("AishwaryaBhabi"));

		Function<Integer, Integer> fun1 = i -> i + i;
		Function<Integer, Integer> fun2 = i -> i * i * i;

		System.out.println(fun1.andThen(fun2).apply(4)); // fun1 -> fun2
		System.out.println(fun1.compose(fun2).apply(4)); // fun2 -> fun1
		
		Function<String, String> idenfun = Function.identity();
		System.out.println(idenfun.apply("dipak"));
		
	}
}
