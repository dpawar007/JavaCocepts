package oops;

interface inter1 {
	 
}

interface inter2 {
	 
}

interface inter3 extends inter1,inter2{
	
}

public class InterfaceDemo implements inter2,inter1,inter3{
	public void main(String[] args) {
		InterfaceDemo demo = new InterfaceDemo();		 
	}

	 
}
