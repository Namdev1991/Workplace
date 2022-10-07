package Scannerclass;
import java.util.Scanner;

public class Practice {
	
	static void method(int num) {
		int sum=0;
		for(int i=0;i<=num;i+=2) {
			sum=sum+i;
		}
		System.out.println("Addition of numbers = "+sum);
	}
	static void method1(int num) {
		int count=0;
		for(;num!=0;count++) {
			num=num/10;
		}System.out.println(" Count of digits"+count);
	}
	static void method2(int num) {
		int sum=0;
		for(;num>0;) {//
			int x=num%10;//
			sum=sum*10+x;//
			num=num/10;
			System.out.print(sum);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter Num1");
			int num=ref.nextInt();
			Practice.method(num);
			Practice.method1(num);
			Practice.method2(num);
			
	}

}
