package generics;

class Test <T extends String&Runnable&Cloneable>{

}

class BoundedTypes<T extends Number> {
}

public class BoundedTypesDemo {
	public static void main(String[] args) {
		BoundedTypes<Integer>  i = new BoundedTypes();
//		BoundedTypes<String>  s = new BoundedTypes();
		
		} 
	 
		 
	
}
