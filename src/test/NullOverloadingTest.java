package test;

public class NullOverloadingTest {

	public static void main(String[] args) {
		NullOverloadingTest nullOverloadingTest = new NullOverloadingTest();
		nullOverloadingTest.display(null);
	}
	
	
	void display(Object o) {
		System.out.println("Object");
	}
	 	 
	
	
	void display(String o) {
		System.out.println("Object");
	}
	 

	
//	void display(StringBuffer o) {
//		System.out.println("Object");
//	}
	 

}
