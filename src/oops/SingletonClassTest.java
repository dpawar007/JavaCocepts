package oops;

public class SingletonClassTest {

	void display() {
		Runtime r1=Runtime.getRuntime();
		//getRuntime() method is a factory method
		Runtime r2=Runtime.getRuntime();
		Runtime r3=Runtime.getRuntime();
		
		System.out.println(r1==r2);//true
		System.out.println(r1==r3);//true
			
	}
	
	public static void main(String[] args) {
		SingletonClassTest obj = new SingletonClassTest();
		obj.display();
	}

	
	
}
