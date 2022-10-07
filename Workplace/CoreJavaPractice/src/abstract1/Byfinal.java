package abstract1;
abstract class First{
	final void one(int num1,int num2) {
	 int res=num1+num2;
	 System.out.println("Result of Final Void Method "+res);
	}
	abstract void one(int num1); 
		void two(int num1,int num2) {
			int res=num1*num2;
			System.out.println("Result of Method Two "+res);
	}
}
public class Byfinal extends First {
	void one(int num1) {
		super.one(20, 30);
		super.two(15, 16);
	}

	public static void main(String[] args) {
		Byfinal x1=new Byfinal();
		x1.one(20);
		x1.one(20,30);
		// First x2=new First();--> 
		First x2=new Byfinal();
		x2.one(10,20);
		x2.two(20,60);
	}
}
