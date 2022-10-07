package inheritance;
class School{
	final int num1=10;
	final int num2;
	static void method1(int num1,int num2) {
		System.out.println("Method 1 num 1 = "+num1);
		System.out.println("Method 1 num 2= "+num2);
	}
	void method2() {
		System.out.println("Superclass Method ");
	}
	School(int num2){
		this.num2=num2;
		System.out.println(this.num2);
	}
}

public class Practice1608 extends School{
	 	Practice1608(){
	 		super(30);
	 		System.out.println("Constructor of Sub-Class");
	 	}
	 	void method2() {
	 		System.out.println("Method of Sub Class ");
	 	}
	 	 static void method1(int num1,int num2) {
	 		System.out.println("Method of SubClass ");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School x1=new School(20);
		Practice1608 x2=new Practice1608();
		x2.method1(20,15);
		x2.method2();
		//x1.method1(20, 25);
		
		
	}

}
