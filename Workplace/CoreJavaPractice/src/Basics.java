
class New{
static int num1=20;
static double num2=10.20;
	double method2() {
	double add=num1+num2;
	return add;
	}
	New(){
		
	}
}
public class Basics extends New {
	int num1=20;
	static double num2=20.10;
	static double method1() {
		Basics b1=new Basics();
		double add=b1.num1+num2;
		return add;
	}
	double method2() {
		double add2=num1+num2;
		return add2;
	}
	void method3(int num1) {
		this.num1=num1;
		double mul=num2*this.num1;
		System.out.println(mul);
	}
	static void method4() {
		Basics b2=new Basics();
		double div=num2/b2.num1;
		System.out.println(div);
	}
	double method2(int num2) {
		double add=num2+num1;
		return add;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Basics.method1());
		double a1=Basics.method1();
		Basics b1=new Basics();
		System.out.println(b1.method2());
		b1.method3(10);
		Basics.method4();
	}

}
