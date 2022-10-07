package abstract1;
abstract class One {
	int num=10;
	static int num1=20; 
	abstract void method();
	void method1(int num1) {
		int num2=10;
		int result=num1+num2;
		System.out.println("Result of Non abstract MEthod = "+result);
	}
	One(int num3,int num4){
		int result=num3/num4;
		System.out.println("Result of PArameterised Constructor = "+result);
	}
	//final abstract xyz() {
		// Final Method  - Final means it can't be override 
	// Abstract ---> It should be Override in SUbclass 
	//So Ambiguity in Both and this is not Possible
//	}
}
public class Abstract extends One {
	
	Abstract(int xyz){
		super(60,30); //It is mandatory to write a Super statement 
		int result=super.num*One.num1;
		System.out.println("The Abstact Constructor = "+result);
	}
	void method() {
		super.method1(20);
		System.out.println("Overriding of abstract Method");
	}
	void method2(int abc) {
		System.out.println("Method of Abstract Class");
	}

	public static void main(String[] args) {
		//One x1=new One;---->  As Class is abstract then we Cannot Create Object,It must be inherited from another class
		One x=new Abstract(20);
		Abstract x1=(Abstract)x;
		x.method();
		One y=new Abstract(30);// by this Heterogeneous Statement we can call One class Methods by using reference 
		// of y but we can't call methods of abstract class. 
		
}
}