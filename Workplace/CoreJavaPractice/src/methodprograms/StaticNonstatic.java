package methodprograms;

public class StaticNonstatic {
	int num1=25;
	static int num2=15;
	static double add()
	{
		StaticNonstatic ref= new StaticNonstatic();
		double res=(ref.num1+num2);
		System.out.println("Value of Number 1 =  "+ref.num1);
		System.out.println("Value of Number 2 =  "+num2);
		return res;
		
	}
	double sub()
	{
		int num3=35;
		double res1=(num3-num1);
		System.out.println("Value of Number 3 =  "+num3);
		return res1;
	}
		static double mul()
		{
			double ref3=add();
			StaticNonstatic m2=new StaticNonstatic();
			double ans=ref3*m2.sub();
			return ans;
		}
		
	public static void main(String[] args) {
	double ref1=add();
	StaticNonstatic m1=new StaticNonstatic();
	double ref2=m1.sub();
	System.out.println("Addition of Number 1 & Number 2 = "+ref1);
	System.out.println("Substraction of Number 3 & Number 1   = "+ref2);
	System.out.println("Multipliactin of Ref1 & Ref 2  =  "+mul());
	
	}
}
