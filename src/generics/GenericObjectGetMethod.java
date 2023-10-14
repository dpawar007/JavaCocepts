package generics;

public class GenericObjectGetMethod<T> {
	T obj;

	GenericObjectGetMethod(T obj) {
		this.obj = obj;
	}

	public void show() {
		System.out.println("The type of object is : " + obj.getClass().getName());
	}

	public T getObject() {
		return obj;
	}

	public static void main(String[] args) {
		GenericObjectGetMethod<Integer> g1 = new GenericObjectGetMethod<Integer>(10);
		g1.show();
		System.out.println(g1.getObject());
		GenericObjectGetMethod<String> g2 = new GenericObjectGetMethod<String>("Akshay");
		g2.show();
		System.out.println(g2.getObject());
		GenericObjectGetMethod<Double> g3 = new GenericObjectGetMethod<Double>(10.5);
		g3.show();
		System.out.println(g3.getObject());
	}
}
