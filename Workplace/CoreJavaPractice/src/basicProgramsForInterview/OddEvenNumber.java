package basicProgramsForInterview;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Enter number is Even");
		}else {
			System.out.println(("Eneter number is odd"));
		}
	}

}
