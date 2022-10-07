package methodprograms;

public class Methodoverloading {

	public static void main(String[] args) {
		
Mixed2.add(75, 85);
System.out.println("ANSWER of Method Mixed1 = "+Mixed1.mul(100,50));
Mixed2 ref=new Mixed2();
System.out.println("Ans of NoN Static  = "+ref.div(75.60,60.75));

	}

}
class Mixed2 {
	int a=25;
	static float roi=6.5f;
	static void add(int num1,int num2)
	{
		int res=num1+num2;
		double res1=roi*res;
		System.out.println("The value of num1 is =  "+num1);
		System.out.println("The value of num2 is =  "+num2);
		System.out.println("The addition of num1 & num2 =  "+res);
		System.out.println("Result of static void method is "+res1);
		System.out.println("-----------*---------------*-********************-*-*****-");
		
	}
	
double div(double num7,double num8)
{
	double res3=num7/num8;
	System.out.println("The value of num7 is =  "+num7);
	System.out.println("The value of num8 is =  "+num8);
	System.out.println("-----------*---------------*-********************-*-*****-");
	return res3;
}
}