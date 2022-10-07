package Typecasting;
class Up{
	void method() {
		System.out.println("Method");
	}
	void method1() {
		System.out.println("method1");
	}
}
public class UpCasting0608 extends Up {
	
	void method12() {
		System.out.println("Method12");
	}
	void method11() {
		System.out.println("method11");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Up x=new UpCasting0608();   //-----> UpCasting (Implicit ---> Autoupcasting)
		//Superclass Reference =new Subclass Object
		// After upcasting we cannot access methods of Subclass
		Up x1=(Up)new UpCasting0608(); ///------> Upcasting Explicit
		UpCasting0608 x2=(UpCasting0608)x;// ---> 
		// Subclass reference = (Subclass) Object of Upcasting;
	}
}
