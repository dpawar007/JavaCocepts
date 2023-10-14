package serializations;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable {

	String s;
	int i;
	int j;

	public ExternalizationDemo() {
		System.out.println("public no-arg constructor");
	}

	public ExternalizationDemo(String s, int i, int j) {
		this.s = s;
		this.i = i;		 
		System.out.println("public parameterized constructor");
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(i);
		out.writeInt(j);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s = (String) in.readObject();
		i = in.readInt();
	}

	public static void main(String[] args) throws Exception {
		ExternalizationDemo demo = new ExternalizationDemo("dipak", 10, 20);
		FileOutputStream fileOutputStream = new FileOutputStream("/home/dipak/git/JavaLearning/xyz.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(demo);

		FileInputStream fileInputStream = new FileInputStream("/home/dipak/git/JavaLearning/xyz.ser"); // Correct file path
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		ExternalizationDemo demo2 = (ExternalizationDemo) objectInputStream.readObject();
		System.out.println(demo2.s + "-------" + demo2.i + "--------" + demo2.j);

	}
}
