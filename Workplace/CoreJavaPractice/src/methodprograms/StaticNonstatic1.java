package methodprograms;

public class StaticNonstatic1 {
	static int a,b;
	double c,d;
	static int add(int x,int y)
	{
		a=x;
		b=y;
		int res1=(a+b);
		System.out.println("The value of a = "+a);
		System.out.println("The value of b = "+b);
		return res1;
	}
	double sub(double w,double z)
	{
		c=w;
		d=z;
		double res1=(c-d);
		System.out.println("The value of c = "+c);
		System.out.println("The value of d = "+d);
		return res1;
	
	}
	public static void main(String[] args) {
		int ref1=add(260,2670);
		System.out.println("Addition of A & B = "+ref1);
		StaticNonstatic1 m1= new StaticNonstatic1();
		double ref=m1.sub(25645.24, 180365.12);
		System.out.println("Substraction of C& D   ="+ref);
		double finalanswer= (ref1*ref);
		System.out.println("Multiplication of 2 Answers is =  "+finalanswer);
		ref1=add(250,340);
		System.out.println("Addition of A & B = "+ref1);
		ref=m1.sub(85.66,25.30);
		System.out.println("Substraction of C& D   ="+ref)
		;
		finalanswer= (ref1*ref);
		System.out.println("Multiplication of 2 Answers is =  "+finalanswer);
	

	}

}
