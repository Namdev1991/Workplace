package basicprograms;

public class Mixed2 {
static float num1=11.05f;
int num2=20;
double num3=12546.0546;
	public static void main(String[] args) {
	//1) Use of Global Variable
		Mixed2 ref1= new Mixed2();
		double a=(num1 *ref1.num2*ref1.num3);
		System.out.println("Multiplication of Static and Non Static Variables = "+a);
		System.out.println("----*------------*---------------*-----------------*-------");
		
		
		

	}

}
