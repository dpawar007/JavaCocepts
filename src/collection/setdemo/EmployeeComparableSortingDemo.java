package collection.setdemo;

import java.text.ParseException;
import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeComparableSortingDemo {

	public static void main(String[] args) throws ParseException {
		Employees1 e1 = new Employees1("Nag", 100);
		Employees1 e2 = new Employees1("Bala", 200);
		Employees1 e3 = new Employees1("Chiru", 50);
		Employees1 e4 = new Employees1("Venki", 150);
		Employees1 e5 = new Employees1("Nag", 100);
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println("With Comparable ID");
		System.out.println(t);
		TreeSet t1 = new TreeSet(new MyNameComparator1());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println("With Comparator Name");
		System.out.println(t1);
	}

}

class Employees1 implements Comparable<Object> {
	String name;
	int eid;

	Employees1(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return name + "-----" + eid;
	}

	public int compareTo(Object obj) {
		int eid1 = this.eid;
		Employees1 e = (Employees1) obj;
		int eid2 = e.eid;
		if (eid1 < eid2)
			return -1;
		else if (eid1 > eid2)
			return 1;
		else
			return 0;
	}
}

class MyNameComparator1 implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Employees1 e1 = (Employees1) o1;
		Employees1 e2 = (Employees1) o2;

		String n1 = e1.name;
		String n2 = e2.name;

		return n1.compareTo(n2);
	}

}