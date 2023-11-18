package jdk8.methodconstructorreferences;

interface Interf {
	public ConstructorReferences get();
}

public class ConstructorReferences {

	ConstructorReferences() {
		System.out.println("Sample Class Constructor Execution & Object Creation...!!!!!");
	}

	public static void main(String[] args) {
		Interf i = ConstructorReferences::new;
		ConstructorReferences s = i.get();
	}

}
