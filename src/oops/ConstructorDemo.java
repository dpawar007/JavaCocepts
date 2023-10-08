package oops;


class P{
			P(int i) throws java.io.IOException {
				System.out.println("P class constructor");
			}
}
public class ConstructorDemo extends P{

	public ConstructorDemo(int n) throws Exception {		  
		 super(n);
		 System.out.println("This is constructor demo class no-arg constructor");
		 
	}
 
	public static void main(String[] args) throws Exception {
		 
		ConstructorDemo constructorDemo = new ConstructorDemo(1);
	}

}
