package jdk8.interfacedefaultstaticmehtods;

interface Interf{

	//Defined general utility methods
	public static void m1() {
		System.out.println("Static Methods.....!!!!!!!!");
	}	
 
}
public class StaticMethods implements Interf{
	public static void main(String[] args) {
			StaticMethods methods = new StaticMethods();
			System.out.println(methods.hashCode());
			System.out.println(methods.toString());
			Interf.m1();
	}

}
