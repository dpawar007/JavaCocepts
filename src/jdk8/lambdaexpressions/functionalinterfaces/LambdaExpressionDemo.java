package jdk8.lambdaexpressions.functionalinterfaces;

//It is anonymous function
//Not having any name,modifiers & return type
public class LambdaExpressionDemo {
	public static void main(String[] args) {
		FunctionalDemo demo = () -> System.out.println("Funcation Interface with lambda expression.....!!!!");
		demo.display();
	}

}

@FunctionalInterface
interface FunctionalDemo {
	void display();

	public default void read() {
	}

	public static void write() {
	}
}