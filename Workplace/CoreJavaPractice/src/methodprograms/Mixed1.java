package methodprograms;

public class Mixed1 {
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
	void sub(int num3,int num4)
	{int res=num3-num4;
	double res1=roi*res;
	System.out.println("The value of num3 is =  "+num3);
	System.out.println("The value of num4 is =  "+num4);
	System.out.println("The Substraction of num3 & num4 =  "+res);
	System.out.println("Result of Nonstatic void method is "+res1);	
	System.out.println("-----------*---------------*-********************-*-*****-");
	}
static double mul(double num5,double num6)
{
	double res2=num5*num6;
	System.out.println("The value of num5 is =  "+num5);
	System.out.println("The value of num6 is =  "+num6);
	System.out.println("-----------*---------------*-********************-*-*****-");
	return res2;
		
}
double div(double num7,double num8)
{
	double res3=num7/num8;
	System.out.println("The value of num7 is =  "+num7);
	System.out.println("The value of num8 is =  "+num8);
	System.out.println("-----------*---------------*-********************-*-*****-");
	return res3;
}
	public static void main(String[] args) {
	Mixed1 a1=new Mixed1();
	System.out.println("The value of non static variable is =  "+a1.a);
	add(25,45);
	a1.sub(45,10);
	double ref1=mul(45,60);
	System.out.println("The multiplication of num5 & num6 =  "+ref1);
	double ref2=a1.div(12564, 122);
	System.out.println("The Division of num7 & num8 =  "+ref2);
	double finalvalue=ref1*ref2*a1.a;
	System.out.println("Final Value of All Program  =  "+finalvalue);
	
	}
}
