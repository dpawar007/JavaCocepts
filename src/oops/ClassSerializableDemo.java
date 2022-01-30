package oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Serial implements Serializable {
	private static final long  serialVersionUID = 1L;
	int i = 10;
	int j = 20;
}
public class ClassSerializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Serial d1=new Serial();
		
		System.out.println("Object Before Serialized  :"+d1.hashCode());
		
		System.out.println("Serialization started");
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(d1);
		
		System.out.println("Serialization ended");
		System.out.println("Deserialization started");
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Serial d2=(Serial)ois.readObject();
		
		System.out.println("Object After Serialized  :"+d2.hashCode());
		
		System.out.println("Deserialization ended");
		
		System.out.println(d2.i+"................"+d2.j);

	}

}
