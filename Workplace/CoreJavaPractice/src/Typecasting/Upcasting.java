package Typecasting;
class Upcasting1{
	void method() {
		System.out.println(" Upcasting 1 ");
	}
	void method2() {
		System.out.println("Method2 Upcasting1 ");
	}
	
}
public class Upcasting extends Upcasting1 {
	void method() {
		System.out.println(" Upcasting ");
	}
	void method3() {
		System.out.println("Method 3 ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Upcasting x1=new Upcasting();//Normal Object creation
		//Upcasting1 x2=x1; //Upcasting // Implicit Upcasting
		Upcasting1 x2=new Upcasting(); //Implicit Upcasting
		x2.method();//Calling superclass method
		x2.method2();// Calling superclass method
		//x2.method3();// Not possible to Access the Method
		Upcasting1 x3=(Upcasting1)new Upcasting();  // Explicit Upcasting
	}
}
