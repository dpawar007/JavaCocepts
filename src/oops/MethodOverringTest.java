package oops;

class Animal {
	void instanceMethod() {
		System.out.println("instance method in Animal");
	}

	static void staticMethod() {
		System.out.println("static method in Animal");
	}
}

class Dog extends Animal {
	void instanceMethod() {
		System.out.println("instance method in Dog");
	}// overriding

	static void staticMethod() {
		System.out.println("static method in Dog");
	}// hiding

}

class Parents
// parent class
{
	void property() {
		System.out.println("money+land+hhouse");
	}

	void marry() {
		System.out.println("black girl");
	}// overridden method
};

class Child extends Parents// child class
{
	void marry() {
		System.out.println("white girl/red girl");
	}
	// overriding method
}

public class MethodOverringTest {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.instanceMethod();
		a.staticMethod(); // [or] Animal.instanceMethod();

		System.out.println();
		
		Child c = new Child();
		c.property();
		c.marry();
		Parents p = new Parents();
		p.property();
		p.marry();

	}
}
