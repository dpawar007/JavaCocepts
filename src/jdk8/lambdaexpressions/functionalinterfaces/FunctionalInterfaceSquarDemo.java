package jdk8.lambdaexpressions.functionalinterfaces;

interface SquareDemo {
	public int getSquare(int s);
}

public class FunctionalInterfaceSquarDemo {
	public static void main(String[] args) {
		SquareDemo demo = s -> s * s;
		System.out.println(demo.getSquare(2));
		System.out.println(demo.getSquare(3));
		System.out.println(demo.getSquare(4));			 
	}
}