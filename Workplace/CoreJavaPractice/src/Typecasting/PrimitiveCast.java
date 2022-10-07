package Typecasting;

/* Type casting - Convert one type into another type is known as Type casting 
 * Use- To support Heterogeneous Statement in java. 
 * Primitive Data type- Convert one data type into another data type is known as Data type casting
 * Widening- Convert Lower To Higher 
 * Narrowing - Convert Higher To Lower (We loss data due to narrowing )
 * Implicit- By java compiler Widening is possible but Narrowing is not possible 
 * Explicit- By Manual -Widening and narrowing is possible
 */
public class PrimitiveCast {
	static double num1=60.012365423656945658;
	int num2=(int)num1;// Explicit Narrowing Type casting
	float num3=(float)num1;
	static int num4=20;
	double num5=num4;//Implicit Widening Casting.
	static double num6=(float)num4;//Explicit widening casting.
	static float num7=(float)num1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimitiveCast x1=new PrimitiveCast();
		System.out.println(num1);
		System.out.println(x1.num2);
		num1=50.2065;//reinitializing of num1
		x1.num2=30;
		System.out.println(num1);
		System.out.println(x1.num2);
		System.out.println("num3= "+x1.num3);
		System.out.println(x1.num5);
		System.out.println(num6);
	}
}
