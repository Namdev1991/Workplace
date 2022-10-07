abstract class Parent{
	int num1=20;
	static int num2=25;
	abstract void method1(int num);
	abstract void method3();
	 void method2(int num,int num1) {
		 int res= num*num1;
		 System.out.println(" Result of Abstract MEthod "+res);
	 }
	 Parent(int num1,int num2){
		 int result=this.num1*num1;
		 int result1=result*num2*Parent.num2;
		 System.out.println("result of Parent class "+result1);
	 }
}
public class P0707 extends Parent {
	void method1(int num) {
		System.out.println(" This is overrided Method1 ");
		method2(25,30);
	}
	void method3() {
		this.method1(25);
		System.out.println(" This is overrided method3 ");
	}
	P0707(){
		super(20,30);
		this.method3();
		System.out.println("This is Constructor of P0707");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P0707 x1=new P0707();
		System.out.println("----------*--------------*--------------------------");
		Parent x2=new P0707();
		System.out.println("       ------------------***-------------------------");
		x2.method2(30,50);
		x2.method1(25);
		x2.method3();
	}

}
