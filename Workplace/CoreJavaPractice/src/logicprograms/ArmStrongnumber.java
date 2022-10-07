package logicprograms;
import java.util.Scanner;
public class ArmStrongnumber {

	//Question- Write a Program for Armstrong number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter number to check Armstrong");
		int number=ref.nextInt();
		int temp=number;
		int power=0;
		while(temp>0) {
			temp=temp/10;
			power++;
		}
		double result=0;
		temp=number;
		while(temp>0) {
			int remainder=temp%10;
			result=result+Math.pow(remainder, power);
			temp=temp/10;
		}				
		if(result==number) {
			System.out.println("Number is ArmStrong number");
		}else {
			System.out.println("Number is Not Armstrong number");
		}
	}

}
