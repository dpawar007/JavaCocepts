package oops;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;

public class ObjectCreationTest {

	void dispaly(int i) {
		System.out.println("Object Created : "+i);
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException, IOException {
 
		//By using new Operator :
		ObjectCreationTest obj =new ObjectCreationTest();
		obj.dispaly(1);
		
 		//By using newInstance() :(Reflection Mechanism)
	    ObjectCreationTest obj1 = (ObjectCreationTest) Class.forName("ObjectCreationTest").newInstance();
	    obj1.dispaly(2);
 		
	    //By using Clone()
		ObjectCreationTest test =new ObjectCreationTest();
		ObjectCreationTest obj2= (ObjectCreationTest) test.clone();
		obj2.dispaly(3);
		
 
		//By using Factory methods
		Runtime r = Runtime.getRuntime();
		DateFormat df = DateFormat.getInstance();
		
		//By using Deserialization 
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ObjectCreationTest obj3 =(ObjectCreationTest) ois.readObject();
	}

}
