package jdk8.functionalinterfaces.primitivetype;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

//Total 15 
public class AllPossiblePrimitiveFunctionInterfaceDemo {
	public static void main(String[] args) {
		// Input Type Primitive
		IntFunction<Integer> ifd = i -> i * i;
		LongFunction<Long> lfd = i -> i * i;
		DoubleFunction<Double> dfd = d -> d * d;

		// Return Type Primitive
		ToIntFunction<Integer> tif = i -> i * i;
		ToLongFunction<Integer> lif = i -> i * i;
		ToDoubleFunction<Integer> dif = i -> i * i;

		// Both Input and Return Type Primitive
		IntToLongFunction itl = i -> i * i;
		IntToDoubleFunction itd = i -> i * i;

		LongToIntFunction lti = i -> (int) (i * i);
		LongToDoubleFunction ltd = i -> i * i;

		DoubleToIntFunction dti = i -> (int) (i * i);
		DoubleToLongFunction dtl = i -> (long) (i * i);

		// Bi-fucntion Primitive
		
		ToIntBiFunction<Integer, Integer> tib = (a, b) -> a + b;

		ToLongBiFunction<Integer, Integer> tlb = (a, b) -> a + b;

		ToDoubleBiFunction<Integer, Integer> tdb = (a, b) -> a + b;

	}

}
