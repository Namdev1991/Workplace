package assignment18_06_2022;

public class Reversenumber {

	static void reverse(int num) {
		int a=num;
		int sum=0;
		for(;num>0;) {
			int x=num%10;
			sum=sum*10+x;
			num=num/10;
		}
		System.out.println("Revesrse number of "+a+" is = "+sum);
		
		//for palindrome please use commented syntax
		/*if(a==sum) {
			System.out.println("The entered number is palindrome");
		}else {
			System.out.println("The Entered number is NOT Palindrome");
		}*/
		
	}
	
	public static void main(String[] args) {
		reverse(123321);

	}

}
