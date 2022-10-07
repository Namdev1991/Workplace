package methodprograms;

public class NonStaticMethod {
	public double add(int num1,int num2)
	{
		System.out.println("Number 1 = "+num1);
		System.out.println("Number 2 = "+num2);
		double xyz=num1+num2;
		return xyz;
	
	}

	public static void main(String[] args) {
		NonStaticMethod m1=new NonStaticMethod();
		m1.add(25,45);//Calling Non Static method into static method
		
		System.out.println("Addition of two number   = "+m1.add(25, 45));
		
	}

}
