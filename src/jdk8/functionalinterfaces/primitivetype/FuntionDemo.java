package jdk8.functionalinterfaces.primitivetype;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class FuntionDemo {

	public static void main(String[] args) {
		IntFunction<Integer> f = i -> i * i;
		System.out.println(f.apply(5));

		ToIntFunction<String> tif = s -> s.length();
		System.out.println(tif.applyAsInt("dipak"));

		IntToDoubleFunction itd = i -> Math.sqrt(i);
		System.out.println(itd.applyAsDouble(5));
		System.out.println(itd.applyAsDouble(7));
	}

}
