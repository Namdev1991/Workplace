package consthisfinal;

public class Mixed1 {
	int num1;
	int num2;
	final int num5;
	Mixed1( int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
		num5=10;
	}
	Mixed1(){
		this(15,25);
	}
	static {
		System.out.println("Program Starts");
	}
	{
		System.out.println("Creating a Object ");
	}
	int add(int num3,int num4) {
		int res=num3+num4;
		return res;
	}
	static void sub(int num6,int num7) {
	int res=num6-num7;
	System.out.println(" Static Void Result Printing = "+res);
	}
	public static void main(String[] args) {
		Mixed1 a=new Mixed1();
		System.out.println(" Calling NON STATIC Method"+a.add(10,20));
		sub(20,15);
	}

}
