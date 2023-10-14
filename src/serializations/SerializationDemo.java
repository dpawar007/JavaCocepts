package serializations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Serial implements Serializable{
	static transient int a = 10;
	transient final int b = 20;
}
public class SerializationDemo{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			Serial serial = new Serial();
			System.out.println("Serialization started");
			FileOutputStream fos = new FileOutputStream("/home/dipak/git/JavaLearning/abc.ser");
			ObjectOutputStream oot = new ObjectOutputStream(fos);
			oot.writeObject(serial);
			System.out.println("Serialization ended");
			System.out.println("Deserialization started");
			FileInputStream fis =  new FileInputStream("/home/dipak/git/JavaLearning/abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Serial s = (Serial) ois.readObject();			
			System.out.println("Deserialization ended");
			System.out.println(s.a+"................"+s.b);
	}

}
