package generics;

import java.util.ArrayList;

public class GenericsDemo<T> {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("dipak");
		arrayList.add("vinod");
		arrayList.add("deepak");

		String name1 = arrayList.get(0);
		String name2 = arrayList.get(1);
		String name3 = arrayList.get(2);

		System.out.println(name1 + " " + name2 + " " + name3);

		MyGenericClass<ArrayList> class1 = new MyGenericClass<ArrayList>();
		class1.setData(arrayList);
		System.out.println("Generic class1 response : " + class1.getData());

		MyGenericClass<String> class2 = new MyGenericClass<String>();
		class2.setData(name2);
		System.out.println("Generic class2 response : " + class2.getData());

		MyNormalClass class3 = new MyNormalClass();
		class3.setData(name1);
		System.out.println("Normal class3 response : " + class3.getData());

	}

}
