package jdk8.functionalinterfaces.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + " " + s2);
		biConsumer.accept("Dipak", "Pawar");
	}

}
