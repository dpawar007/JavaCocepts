package generics;

import java.util.ArrayList;

public class WildCardDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Dipak");
		al.add("Vijay");
		al.add(null);

		ArrayList<Number> alI = new ArrayList<>();
		alI.add(1);
		alI.add(2);
		alI.add(null);

		WildCardDemo cardDemo = new WildCardDemo();
		cardDemo.method1(al);
		cardDemo.method3(alI);
		ArrayList<?> alm2 = cardDemo.method2();
		System.out.println(alm2);
		ArrayList<?> alm4 = cardDemo.method4();
		System.out.println(alm4);
	}

	void method1(ArrayList<?> l) {
		System.out.println(l);
	}

	void method3(ArrayList<? extends Object> l) {
		System.out.println(l);
	}
	
	ArrayList<?> method2() {
		ArrayList<?> al = new ArrayList<>();		
//		al.add("Dipak");
//		al.add("Vijay");		 
		al.add(null);
		return al;
	}
	
	ArrayList<?> method4() {
		ArrayList<? super String> al = new ArrayList<>();		
        al.add("Dipak");
        al.add("Vijay");		 
		al.add(null);
		return al;
	}
}
