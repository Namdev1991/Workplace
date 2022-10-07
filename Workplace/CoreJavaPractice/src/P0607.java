class First{
	int num1=20;
	final int num2;
	static int num3=30;
	final static int num4;
	static {
		num4=40;
		int res=num3+num4;
		System.out.println("Program Start of class First");
		System.out.println("Printing Result of Static Block = "+res);
	}
	{
		num2=25;
		int res=num2*num1*num4*num3;
		System.out.println("Printing Result of NON Static Block = "+res);
	}
	 void method(int num1) {
		int res=this.num1*num1;
		int res1=res*this.num2*num3;
		System.out.println("Result of Method "+res1);
	}
	void method(int num1,int num2) {
		int res=this.num2/(num1+num2);
		System.out.println("Result of Overloaded Method "+res);
	}
	First(int num1){
		int res=num1+this.num1+num4;
		System.out.println("Result of Constructor = "+res);
	}
	First(double num1,int num2){
		double res=num1*num2;
		System.out.println("Result of Overloaded Constructor = "+res);
	}
}
public class P0607 extends First {
		P0607(){
			super(20);
			System.out.println("Constructor of P0607");
		}
		P0607(int num1){
			super(10.0,30);
			System.out.println("Parameter Constructor of class = "+num1);
		}
		 void method(int num1) {
			int res=super.num1*num1;
			int res1=res*super.num2*First.num3;
			System.out.println("Result of overrided Method "+res1);
		}
		void method1(int num1,int num2) {
			super.method(20);
			int sum=num1*num2;
			System.out.println("Result of Method 1 of class P0607 = "+sum);
		}

	public static void main(String[] args) {
		P0607 x1=new P0607();
		P0607 x2=new P0607(20);
		x1.method(20);
		x1.method(20,30);
		System.out.println(x1.num1);
		System.out.println(x2.num2);
		System.out.println(First.num3);
		System.out.println(First.num4);
		First x3=new P0607();
		x1.method1(20,30);
	}

}
