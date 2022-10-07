package basicprograms;

public class Example5StaticVariable {
	static float num1=25.04f;//NON STATIC
	static double num2=6;//STATIC

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=(num1+num2);
		int a;
		a=10;
		System.out.println("Value of A=  "+a);
		a=15;
		
		double mul=(num1*num2);
		double division=num1/num2;
		double mod=num1%num2;
		
		System.out.println("Number1=  "+num1);
		System.out.println("Number2 =   "+num2);
		System.out.println("sum of two numbers=  "+sum);
		System.out.println("mul of two numbers=  "+mul);
		System.out.println("division of two numbers=  "+division);
		System.out.println("mod of two numbers=  "+mod);
		System.out.println("-----------*--------------*---------------*--------------*");
		
		
		
		/*Reinitializing of Static Global Variable*/
		num1=12546849.12564f;
		num2=123545;

		System.out.println("Number1=  "+num1);
		System.out.println("Number2 =   "+num2);
		System.out.println("sum of two numbers=   "+sum);
		System.out.println("mul of two numbers=  "+mul);
		System.out.println("division of two numbers=  "+division);
		System.out.println("mod of two numbers=  "+mod);
		
		
	}

}
