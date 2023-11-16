package jdk8.interfacedefaultstaticmehtods;


interface Left{
	public default void m1() {
		System.out.println("Default Left");
	}
}

interface Right{
	public default void m1() {
		System.out.println("Default Right");
	}
}
public class DefaultOverridesDemo implements Left,Right {

	public static void main(String[] args) {
		DefaultOverridesDemo defaultOverridesDemo = new DefaultOverridesDemo();
		defaultOverridesDemo.m1();

	}

	@Override
	public void m1() { 
	 System.out.println("My Own Implementation.........!!!!!!!");
	}
	
//	@Override
//	public void m1() { 
//		Right.super.m1();
//	}
	
//	@Override
//	public void m1() {		 
//		Left.super.m1();
//	}

}
