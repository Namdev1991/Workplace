package interface1;
interface Four{
	void method();//public abstract
	int num1=20;//public static final
	void method1();
	static void method2(int num) {
		System.out.println("Static method of interface one "+num);
	}
	default void method3(int num2) {
		System.out.println("Default method of interface one "+num2);
	}
}
interface Three extends Four{
	void method();
	void method2();
	default void method3(int num3) {
		System.out.println(" overrided Default Method  ");
	}
}

class Interface20{
	static void add() {
		System.out.println(" add ");
	}
	void sum() {
		System.out.println("SUM ");
	}
}
class Interface21 extends Interface20 implements Three{
	public void method() {
		System.out.println(" Method OF Interface 21 ");
	}
	public void method2() {
		System.out.println(" Method2 of Inteface 21 ");
	}
	
	public void method1() {
		System.out.println("Method1 of Interface 21 ");
	}
}
public class Interface2 implements Three {
	public void method() {
		System.out.println(" Method of class  ");
	}
	public void method1() {
		System.out.println(" Method1 of Class ");
	}
	public void method2() {
		System.out.println(" Method2 of Class  ");
	}
	 public void method3(int num5) {
		
	}

	public static void main(String[] args) {
		Three x1=new Interface2();
		x1.method();
		x1.method1();
		x1.method2();
		Four.method2(20);
		x1.method3(15);
		Three x4=(Three)x1;
		x4.method();
		Four x5=(Four)x1;
		//x5.method3(25);
		Interface20 x2=new Interface20();
		Interface20.add();
		x2.sum();
		Interface21 x3=new Interface21();
		Interface21.add();
		x3.sum();
		x3.method();
		
	}
}
