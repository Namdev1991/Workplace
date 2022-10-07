package exception;

public class ThrowKeyword {
	static void Method(int  num1) {
		try {
			if(num1<5) {
				throw new ArithmeticException ("The Number is wrong");
				//System.out.println("home");----> Unreachable code - it will never Execute
			}else {
				System.out.println("The number is Correct");
			}
		}
		catch(ArithmeticException k) {
			System.out.println(k);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowKeyword.Method(2);
	}

}
