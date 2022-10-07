package abstract1;
abstract class Atm{
	static void method(int num) {
		System.out.println("Method of Abstract Superclass");
	}
	Atm(int num2){
		System.out.println("Cnstructo of Abstact Class ");
	}
	abstract void method1();

}

public class Abstraction extends Atm {
	Abstraction(){
		super(16);
	}
	
	void method1() {
		System.out.println("method of Abstraction Class ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstraction x1=new Abstraction();
		x1.method1();
		x1.method(20);
	}

}
