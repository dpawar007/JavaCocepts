package jdk8.methodconstructorreferences;

//Advantage Code Re-usability
interface Inter {
	public void m();
}

public class MethodReferenceDemo {

	public static void m1() {
		System.out.println("Test the method reference...!!!");
	}

	public static void main(String[] args) {
		Inter i = MethodReferenceDemo::m1; // Internally m1 method refer m method only need to match the argument
		i.m();
	}

}
