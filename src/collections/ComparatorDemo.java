package collections;

import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthSeparatorUI;

class MyComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer) obj1;
		Integer i2 = (Integer) obj2;
		if (i1 < i2)
			return +1;
		else if (i1 > i2)
			return -1;
		else
			return 0;
		
		/*
		Various Possible Implementations of compare(): 
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		return I1.compareTo(I2); //[0, 5, 10, 15, 20] Ascending Order
		return -I1.compareTo(I2); //[20, 15, 10, 5.0] Descending Order
		return I2.compareTo(I1); //[20, 15, 10, 5.0]
		return -I2.compareTo(I1); //[0, 5, 10, 15, 20]
		return +1; //[10, 0, 15, 5, 20, 20] Insertion Order
		return -1; //[20, 20, 5, 15, 0, 10] Reverse of Insertion Order
		return 0; //[10] Only 1 st Inserted Element Present And All Remaining Elements Treated as Duplicates
*/	}
}
public class ComparatorDemo {

 
	public static void main(String[] args) {
   //TreeSet t = new TreeSet(new MyComparator());
		TreeSet t = new TreeSet();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}
