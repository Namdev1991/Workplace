package operators;

public class PositiveNegative {
static void check(double Num1) {
	if (Num1>0) {
		System.out.println("The Number is Positive");
	}else if(Num1<0) {
		System.out.println("The Number is Negative");
	}else {System.out.println("The Number is Zero");
	}
	}

	public static void main(String[] args) {
		check(85);
		check(0);
		check(-86);
		

	}

}
