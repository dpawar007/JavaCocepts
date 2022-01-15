package oops;

class SingletonTest {
	
	private static SingletonTest t = null;

	private SingletonTest() {}

	synchronized public static SingletonTest getSingletonTest() {
		if (t == null) {
			t = new SingletonTest();
		}
		return t;

	}
}

public class SingletonCreatedClass {

	public static void main(String[] args) {
		System.out.println(SingletonTest.getSingletonTest().hashCode());
		System.out.println(SingletonTest.getSingletonTest().hashCode());
		System.out.println(SingletonTest.getSingletonTest().hashCode());
	}
}
