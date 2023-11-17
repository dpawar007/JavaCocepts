package jdk8.functionalinterfaces.primitivetype;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		IntConsumer ic = i -> System.out.println(i * i);
		ic.accept(5);

		LongConsumer lc = i -> System.out.println(i * i);
		lc.accept(5);

		DoubleConsumer dc = i -> System.out.println(i * i);
		dc.accept(5);

		// One Input is Object Type and Other is Primitive
		ObjIntConsumer<Integer> oti = (a, b) -> System.out.println(a + b);
		oti.accept(new Integer(10), 10);
		ObjLongConsumer<Long> otl = (a, b) -> System.out.println(a + b);
		otl.accept(new Long(10), 10);
		ObjDoubleConsumer<Double> otd = (a, b) -> System.out.println(a + b);
		otd.accept(new Double(10), 10);
		
		
	}
}
