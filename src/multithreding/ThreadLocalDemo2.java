package multithreding;

public class ThreadLocalDemo2  extends Thread{ 
	static Integer custID = 0;
	String name = null;
	public ThreadLocalDemo2(String name) {
		super(name);
	}	
	public static void main(String[] args) {	
		ThreadLocal l = new ThreadLocal() {
			 @Override
			protected Object initialValue() {			 
				return ++custID;
			}
		};
	 ThreadLocalDemo2 demo2  = new ThreadLocalDemo2("CustomerThread");
	 demo2.start();		 
	}	
	@Override
	public void run() {		 
		 System.out.println(name+this.custID);
	}

}
