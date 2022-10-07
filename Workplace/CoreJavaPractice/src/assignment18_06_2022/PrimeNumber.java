package assignment18_06_2022;
import java.util.Scanner;
public class PrimeNumber {
	static void prime(int num) {
		int temp=0;
		for(int i=2;i<num-1;i++) {
			if(num%i==0) {
				temp=temp+1;
			}
		}
		if(temp>0) {
			System.out.println("The Number is Not Prime");
		}else {
			System.out.println("The number is Prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ref=new Scanner(System.in);
		int num;
		System.out.println(" Enter No to check wheather it is Prime or Not ");
		num=ref.nextInt();
		prime(num);
		
	}
}
