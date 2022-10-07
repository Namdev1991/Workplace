package practice;

public class Quatient {
	static double quatientremainder(int num1,int num2 ) {
		int quatient=num1/num2;
		System.out.println("The Quatient of NUM1 & NUM2 = "+quatient);
		double remainder=num1%num2;
		return remainder;
	}

	public static void main(String[] args) {
		System.out.println("The Remainder of NUM1 & NUM2 = "+quatientremainder(36,10));
	}

}
