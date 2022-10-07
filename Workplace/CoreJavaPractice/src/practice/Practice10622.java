package practice;

public class Practice10622 {
	public static void main(String[] args) {
		Practice10622.add(25,36);
		Practice10622 b=new Practice10622();
				b.sub(45.66,20);
				float d=div(122.14f,20);
		System.out.println("Answer of Static Float Method "+Practice10622.div(122.14f,20));
		Next c=new Next();
		double e=c.mul(45, 20);
		System.out.println("Answer of Non Static Different Class"+c.mul(45,20));
		boolean f=d==e;
		boolean g=d!=e;
		System.out.println("Check C& D is Equal or not  ="+f);
		System.out.println("Check C& D is Equal or not  ="+ g);
		 System.out.println("Check And Logical Reason = "+(f&&g));
		 System.out.println("Check And Logical Reason = "+(f||g));
		 System.out.println("Check And Logical Reason = "+!(f||g));
		 
		
					
	}
	int num1=25;     //Non Static Global variable-instance variable
	static float roi=6.5f; //Static Global Variable- class member
	static void add(int num2,int num3)//Static Void Method
	{
		int res=num2*num3;
		Practice10622 a=new Practice10622();
		float res1= res*a.num1*roi;
		System.out.println("Non static Variable"+a.num1);
		System.out.println(" static Global Variable"+roi);
		System.out.println("Answer of Static Void Method"+res1);
			}
	void sub(double num4,double num5)//Non Static Void Method
	{
		double res2=num4-num5;
		double res3=num1*res2*roi;
		System.out.println("Non Static Void Method Answer"+res3);
		
	}
	static float div(float num8,int num9) //Static with Return Type
	{
		float res5=num8/num9;
		return res5;
	}
}


	  class Next //new Class
	{
		double mul(double num6,int num7) //Non Static with Return Type Method
		{
			double res4=num6*num7;		
			return res4;
		}
	}

	

	


