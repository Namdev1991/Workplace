package exception;
import java.util.Scanner;
public class Exception1 {
	//	void method() {
	//		int c=10/0;
	//	}
	//	void method2() {
	//		Exception1 x1=new Exception1();
	//		x1.method();
	//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception1 x=new Exception1();

		Scanner ref=new Scanner(System.in);
		int i=10;
		System.out.println(" Enter Value of denominator ");
		int k=ref.nextInt();
		try{
			System.out.println("Try block started");
			int j=i/k;
			System.out.println(j);
			System.out.println(" try Block Ended");

		}
		catch(ArithmeticException obj) {

		
		//System.out.println("catch block started");
		//System.out.println("Exception = "+obj.getMessage());
		System.out.println("Arithmetic Exception");
		//System.out.println(obj.getStackTrace());
		System.out.println(obj.toString());
	}
	finally {
		System.out.println("This is Finally Block ");
	}

	System.out.println("Rested code Execute");
}

}
