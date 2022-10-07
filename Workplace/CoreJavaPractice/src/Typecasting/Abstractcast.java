package Typecasting;
abstract class cast{
	abstract void method1();
	void method2() {
		System.out.println(" Abstract class Method 2");
	}
	void method3() {
		System.out.println(" Method 3");
	}
	abstract void method();
}
public class Abstractcast extends cast {
	void method() {
		System.out.println(" Overrided method ");
	}
	void method1() {
		System.out.println(" Overrrided Method 1 ");
	}
	void method4() {
		System.out.println(" Method 4 Subclass");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cast x1=new Abstractcast(); //Upcasting 
		x1.method();
		x1.method1();
		x1.method2();
		x1.method3();
		// x1.method4();------> Not exhibit property of subclass -- This means we can access only superclass property
		Abstractcast x2=(Abstractcast)x1;
		System.out.println(" ----- *------------*---------------*--------");
		x2.method2();
	}

}
