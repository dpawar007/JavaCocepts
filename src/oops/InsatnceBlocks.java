package oops;

class Parentp {

	static{System.out.println("parent static block");}//static block
	
	public Parentp() {
		System.out.println("Parent No-Arg Cons ");
	}
	{
		System.out.println("Parent instance block");//instant block
	}
}

class Childs extends Parentp {
	static{System.out.println("child static block");} //static block
	
	{ 
		System.out.println("Child instance block");  //instance block
	}
	
	Childs() {
		System.out.println("chld 0-arg cons");
	} // constructor

}

public class InsatnceBlocks {

	public static void main(String[] args) {
 			Childs c = new Childs();
			 
	}

}
