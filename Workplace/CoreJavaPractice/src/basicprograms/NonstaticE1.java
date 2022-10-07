package basicprograms;

public class NonstaticE1 {
float num1;
double num2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonstaticE1 a=new NonstaticE1();
			
		System.out.println("Num1 =  "+a.num1);
		System.out.println("Num2 =  "+a.num2);
		System.out.println("-----------******-------------*****-----------------");
		
		// Reinitialization of Non static Variable
		
		a.num1=25.0f;
		a.num2=35;
		double res=(a.num1*a.num2);
		System.out.println("Num1 =  "+a.num1);
		System.out.println("Num2 =  "+a.num2);
		System.out.println("Multiplication of Num1 & Num 2 = "+res);
		
		System.out.println("-----------******-------------*****-----------------");
		//2nd object
		
		NonstaticE1 b=new NonstaticE1();
		System.out.println("Num1 after 2nd object without initialization =  "+b.num1);
		System.out.println("Num2 after 2nd object without initialization =  "+b.num2);
		
	}

}
