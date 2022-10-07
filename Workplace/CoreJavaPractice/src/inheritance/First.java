package inheritance;

public class First {
	int a;
	static int b=30;
	{
	a=10;
	System.out.println("This is Non Static Block of Class First "+a);
	}
	First(int c,int d){
		int sum=c+d;
		System.out.println("sum of FIRST NON STATIC BLOCK "+sum);
	}
	int mul(int f,int g) {
		int sum2=f*g;
		return sum2;
	}
}
class Second extends First{

	Second(int e) {
		super(10,20);
		int add=First.b+e;
		System.out.println("Constructor of First "+add);
	}
	public static void main(String []args) {
		Second x1=new Second(20);
		System.out.println("Non Static Variable of Class First = "+x1.a);
		System.out.println("Static Variable of class First = "+First.b);
		System.out.println("Non Static Method of Class First = "+x1.mul(25,40));
	}
}
