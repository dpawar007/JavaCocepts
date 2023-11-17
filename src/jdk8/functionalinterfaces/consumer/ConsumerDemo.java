package jdk8.functionalinterfaces.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> consumer = c -> System.out.println(c);
		consumer.accept("Dipak");		
		}
}
