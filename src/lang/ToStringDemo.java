package lang;

public class ToStringDemo {

	public static void main(String[] args) {  
		ToStringDemo demo = new ToStringDemo();		 
		ToStringDemo demo1 = new ToStringDemo();		 
		System.out.println(demo);	 
		System.out.println(demo.hashCode());	 
		System.out.println(demo.equals(demo1));
		
		String s = "Test";
		String s2 = "Test";
		System.out.println(s.equals(s2));
	}

	@Override
	public String toString() {		 
		// return  "ToStringDemo";
		   return  super.toString();
	}
	
	 @Override
	public int hashCode() {		 
		return super.hashCode();
	}
	 
	 @Override
	public boolean equals(Object obj) {		 
		return super.equals(obj);
	}
	 
	 @Override
	protected Object clone() throws CloneNotSupportedException {		 
		return super.clone();
	}

 
}


