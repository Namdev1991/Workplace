package practice;

public class Numberswap {
	static void swap(int num1,int num2) {
		System.out.println("Initial Value of Num1 = "+num1);
		System.out.println("Initial Value of Num2 = "+num2);
		int x=num1;
		num1=num2;
		num2=x;
		System.out.println("After Swaping value of Num1 = "+num1);
		System.out.println("After Swaping Value of Num2 = "+num2);
	}

	public static void main(String[] args) {
		swap(50,60);

	}

}
