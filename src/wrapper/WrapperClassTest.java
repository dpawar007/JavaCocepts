package wrapper;

public class WrapperClassTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		WrapperClassTest classTest = new WrapperClassTest();
		classTest.valueOfMethod();
		xxxValueMethod();
		parseXXXMethod();
		toStringMethod();
		
		if(classTest.getClass().getMethod("valueOfMethod").getReturnType() == Void.TYPE) {
					System.out.println("Testing of Void Type");
		}
	}

	public void valueOfMethod() {
		Integer i = Integer.valueOf(10);
		Double d = Double.valueOf(10.5);
		Boolean b = Boolean.valueOf(true);
		Character ch = Character.valueOf('a');
		System.out.println(ch); // a
		System.out.println(i);// 10
		System.out.println(d);// 10.5
		System.out.println(b);// true
	}

	public static void xxxValueMethod() {
		Integer i = new Integer(130);
		System.out.println(i.byteValue());// -126
		System.out.println(i.shortValue());// 130
		System.out.println(i.intValue());// 130
		System.out.println(i.longValue());// 130
		System.out.println(i.floatValue());// 130.0
		System.out.println(i.doubleValue());// 130.0

		Character ch = new Character('a');
		char c = ch.charValue();
		System.out.println(c);// a

		Boolean b = new Boolean("ashok");
		boolean b1 = b.booleanValue();
		System.out.println(b1);// false
	}

	public static void parseXXXMethod() {
		int i = Integer.parseInt("10");
		boolean b = Boolean.parseBoolean("ashok");
		double d = Double.parseDouble("10.5");
		System.out.println(i);// 10
		System.out.println(b);// false
		System.out.println(d);// 10.5
	}
	
	public static void toStringMethod() {
		Integer i=Integer.valueOf("10");
		System.out.println(i);//10
		System.out.println(i.toString());//10
		
		String s1=Integer.toString(10);
		String s2=Boolean.toString(true);
		String s3=Character.toString('a');
		System.out.println(s1); //10
		System.out.println(s2); //true
		System.out.println(s3); //a
		
		String s11=Integer.toString(7,2);
		String s21=Integer.toString(17,2);
		System.out.println(s11);//111
		System.out.println(s21);//10001
		
		
		String x1=Integer.toBinaryString(7);
		String x2=Integer.toOctalString(10);
		String x3=Integer.toHexString(20);
		String x4=Integer.toHexString(10);
		System.out.println(x1);//111
		System.out.println(x2);//12
		System.out.println(x3);//14
		System.out.println(x4);//a
	}
	
	
}
