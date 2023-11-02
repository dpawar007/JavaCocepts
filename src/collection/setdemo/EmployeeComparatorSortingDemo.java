package collection.setdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeComparatorSortingDemo {

	public static void main(String[] args) throws ParseException {
		 TreeSet<Employees> employees = new TreeSet<>(new MyIDComparator());
		 TreeSet<Employees> employees1 = new TreeSet<>(new MyNameComparator());
		 TreeSet<Employees> employees2 = new TreeSet<>(new MyDobComparator());
		  
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		 
		 
		 employees.add(new Employees(7, "Diapk", "L1", dateFormat.parse("07-07-1996"), "pune"));
		 employees.add(new Employees(6, "AkashJ", "L2",dateFormat.parse("10-04-1994"), "pune"));
		 employees.add(new Employees(2, "AkashK", "L2",dateFormat.parse("15-03-1997"), "pune"));
		 employees.add(new Employees(8, "Rupesh", "L2",dateFormat.parse("09-12-1995"), "pune"));
		 employees.add(new Employees(1, "Chetan", "L3",dateFormat.parse("12-11-1992"), "pune"));
		 
		 employees1.add(new Employees(7, "Diapk", "L1", dateFormat.parse("07-07-1996"), "pune"));
		 employees1.add(new Employees(6, "AkashJ", "L2",dateFormat.parse("10-04-1994"), "pune"));
		 employees1.add(new Employees(2, "AkashK", "L2",dateFormat.parse("15-03-1997"), "pune"));
		 employees1.add(new Employees(8, "Rupesh", "L2",dateFormat.parse("09-12-1995"), "pune"));
		 employees1.add(new Employees(1, "Chetan", "L3",dateFormat.parse("12-11-1992"), "pune"));
		 
		 employees2.add(new Employees(7, "Diapk", "L1", dateFormat.parse("07-07-1996"), "pune"));
		 employees2.add(new Employees(6, "AkashJ", "L2",dateFormat.parse("10-04-1994"), "pune"));
		 employees2.add(new Employees(2, "AkashK", "L2",dateFormat.parse("15-03-1997"), "pune"));
		 employees2.add(new Employees(8, "Rupesh", "L2",dateFormat.parse("09-12-1995"), "pune"));
		 employees2.add(new Employees(1, "Chetan", "L3",dateFormat.parse("12-11-1992"), "pune"));
		 
		  
		 System.out.println("================--ID-======================");
		 
		 //Display according to the ID ascending sorting 
		 Iterator<Employees> iteratorId = employees.iterator();
		 while(iteratorId.hasNext()) {
			 System.out.println(iteratorId.next());
	      }
		 
		 System.out.println("================--Name-======================");
		 
		//Display according to the Name ascending sorting 
		 Iterator<Employees> iteratorName = employees1.iterator();
		 while(iteratorName.hasNext()) {
			 System.out.println(iteratorName.next());
	      }
		 
		 System.out.println("================--DOB-======================");
		 
	     //Display according to the Date ascending sorting 
		 Iterator<Employees> iteratorDate = employees2.iterator();
		 while(iteratorDate.hasNext()) {
			 System.out.println(iteratorDate.next());
	      }
		 
	}

}

class Employees {
	Integer id;
	String name;
	String desg;
	Date dob;
	String location;	  
	
	 public Employees(Integer id,String name,String desg,Date dob,String location) {
	  this.id = id;
	  this.name = name;
	  this.desg = desg;
	  this.dob = dob;
	  this.location = location;
	}
	 
	 @Override
	public String toString() {	 
		return "Id : "+id+" Name: "+name+" Designation : "+desg+" DOB : "+dob+" location : "+location;
	}
}

class MyIDComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		  Employees e1 = (Employees) o1;
		  Employees e2 = (Employees) o2; 
		  		  
		  Integer i1 = e1.id;
		  Integer i2 = e2.id;
		  
		  return i1.compareTo(i2); 
	}
 	
}


class MyNameComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		  Employees e1 = (Employees) o1;
		  Employees e2 = (Employees) o2; 
		  		  
		  String s1 = e1.name;
		  String s2 = e2.name;
		  
		  return s1.compareTo(s2); 
	}
 	
}


class MyDobComparator implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		  Employees e1 = (Employees) o1;
		  Employees e2 = (Employees) o2; 
		  		  
		  Date d1 = e1.dob;
		  Date d2 = e2.dob;
		  
		  return d1.compareTo(d2); 
	}
 	
}