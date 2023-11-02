package collections.listdemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {		
		ArrayList<String> l = new ArrayList<>(); //Default initial capacity 10  //New Capacity = (Current Capacity * 3/2)+1
		System.out.println("ArrayList Size = "+l.size());
		
		l.add("dipak"); //0
		l.add("vinod"); //1
		l.add("dipak"); //2
		l.add("digu");  //3
		l.add("deepak");//4
		
		 
		ArrayList<String> l2 = new ArrayList<>(15); //With New Initial Capacity 15
		System.out.println("ArrayList Size = "+l2.size());
		
		
		Set<String> set = new HashSet<>();
		set.add("Dipak");
		set.add("Dipak");
		set.add("Deepak");
		set.add("Amol");
		System.out.println("set values => "+set);
		
		ArrayList<String> l3 = new ArrayList<>(set);		
		System.out.println("list values after inter convertion from set to list => "+l3);
		
		System.out.println("===============--Vice-Versa Above Scenario--=====================");
		
		List<String> l4 = new ArrayList<>();
		l4.add("Dipak");
		l4.add("Dipak");
		l4.add("Deepak");
		l4.add("Amol");
		System.out.println("list values => "+l4);
		
		Set<String> s1 = new HashSet<>(l4);		
		System.out.println("list values after inter convertion from list to set => "+s1);
		
		
		System.out.println("===========================---Various ReadyMade Methods---=============================");		
		System.out.println("before remove() => "+l);
		l.remove(2);
		System.out.println("after remove() 2nd index => "+l);
		l.add(2, "raman");
		System.out.println("after adding at 2nd index => "+l);
		l.add("chaman");
		System.out.println("after adding without index param => "+l);
		
		System.out.println("===========================--Created a synchronized arrayList--Also Synchronized Set and Map================================");
   	    ArrayList<String> nsal = new ArrayList<>();  //Default arrayList id non-synchronized 
	    List<String> sal = Collections.synchronizedList(nsal); //Created synchronized arrayList using the Collections class method
 
	    HashSet<String> nshs = new HashSet<>();
	    Set<String> shs = Collections.synchronizedSet(nshs);
	    
	    HashMap<String, String> nsm = new HashMap<>();
	    Map<String, String> sm = Collections.synchronizedMap(nsm);
	    
	    
		ArrayList<String> al = new ArrayList<>();
		LinkedList<String> ll = new LinkedList<>();
		System.out.println(al instanceof Serializable); // true
		System.out.println(ll instanceof Cloneable); // true
		System.out.println(al instanceof RandomAccess); // true
		System.out.println(ll instanceof RandomAccess); // false
 
	}

}
