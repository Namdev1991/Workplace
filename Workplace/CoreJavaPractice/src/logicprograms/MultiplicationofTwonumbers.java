package logicprograms;
import java.util.Scanner;
public class MultiplicationofTwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Quetion- write Java program to multiply two numbers without using * operator 
		//int a=10;
		//int b=20;
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int num1=ref.nextInt();
		System.out.println("Enter Number 2");
		int num2=ref.nextInt();
		int res=0;
		for(int i=1;i<=num2;i++) {
			res=res+num1;
		}
		System.out.println("Answer of two numbers = "+res);
		
	}

}
