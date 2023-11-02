package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator1 implements Comparator {
public int compare(Object obj1, Object obj2) {
String s1 = (String)obj1;
String s2 = obj2.toString();
return s2.compareTo(s1);
	}
}
public class sortMethodDemo {

	public static void main(String[] args) {
 			ArrayList al = new ArrayList();
 			al.add("Z");
 			al.add("A");
 			al.add("K");
 			al.add("N");
 		//al.add(new Integer(10));
 		//al.add(null);//RE: Exception in thread "main" java.lang.NullPointerException
 			System.out.println("Before Sorting:"+al); //Before Sorting:[Z, A, K, N]
 			Collections.sort(al);
 			System.out.println("After Sorting:"+al); //After Sorting:[A, K, N, Z]
 			
 			System.out.println("Before Sorting:"+al); //Before Sorting:[Z, A, K, N]
 			Collections.sort(al, new MyComparator1());
 			System.out.println("After Sorting:"+al); //After Sorting: [Z, N, K, A]
	}

}
