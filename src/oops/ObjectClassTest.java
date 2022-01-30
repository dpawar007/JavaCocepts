package oops;

class Student {
	// instance variables
	String sname;
	int sid;

	Student(String sname, int sid) // local variables
	{
		// conversion
		this.sname = sname;
		this.sid = sid;
	}

	public String toString() // overriding toString() method
	{
		return "student name:-->" + sname + " student id:-->" + sid;
	}
}
public class ObjectClassTest {

	@Override
	public String toString() {
		return "ObjectClassTest";
	}

	
	public static void main(String[] args) {
  
 		ObjectClassTest o = new ObjectClassTest();
		System.out.println(o);
		System.out.println(o.toString());
		
	 
		/*Student s1 = new Student("ratan",111);
		//below two lines are same
		System.out.println(s1);
		//student class toString() executed
		System.out.println(s1.toString()); //student class toString() executed
		Student s2 = new Student("anu",222);
		//below two lines are same
		System.out.println(s2);
		//student class toString() executed
		System.out.println(s2.toString()); //student class toString() executed
*/		
		Student s1=new Student("vijayabhaskar",101);
		Student s2=new Student("bhaskar",102);
		Student s3=new Student("vijayabhaskar",101);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s3));
		
		String ram = "ram";
		String ram1 = new String("ram");
		
		System.out.println(ram == ram1);
		System.out.println(ram1.equals(ram1));
		
		System.out.println(ram.getClass());
		System.out.println(ram.getClass().getName());
	}

}
