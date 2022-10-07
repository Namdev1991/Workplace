package assignment18_06_2022;
class Trial{
	void reverse(int num) {
		int sum=0;
		int a=num;
		for(;num>0;) {
			int x=num%10;
			sum=sum*10+x;
			num=num/10;
		}
		System.out.println("Reverse No of "+a+" is equal to=  "+sum);
	}

	boolean palindrome(int num1) {
		int sum=0;
		int a=num1;
		for(;num1>0;) {
		int y=num1%10;
		sum=sum*10+y;
		num1/=10;
		}
		if(a==sum) {
			System.out.println("The Entered Number is Palindrome");
			return true;
		}else {
			System.out.println("The Entered Number is not Palindrome");
		return false;
		}
	}
	void leap(int year) {
		if(year%4==0 & year % 100!=0 || year%400==0) {
			System.out.println("The Entered year is leap");
		}else {
			System.out.println("The Entered Year is Not leap Year");
		}
	}	
}		
class Final extends Trial{
	void reverse(int num) {
		super.reverse(1234);
		int sum=0;
		while(num>0) {
			int x=num%10;
			sum=sum*10+x;
			num/=10;
		}
		System.out.println("Reverse number of inherited class is = "+sum);
	}
	boolean palindrome(int num2) {
		this.reverse(52164);
		super.palindrome(313);
		int sum=0;
		int a=num2;
		while(num2>0) {
			int x=num2%10;
			sum=sum*10+x;
			num2/=10;
		}
		if(a==sum) {
			System.out.println("The Entered Number inherited  is Palindrome");
			return true;
		}else {
			System.out.println("The Entered Number inherited is not Palindrome");
		return false;
		}
	}
	void leap(int year) {
		this.palindrome(313);
		super.leap(2014);
		if(year%4==0 & year % 100!=0 || year%400==0) {
			System.out.println("The Entered year inherited is leap");
		}else {
			System.out.println("The Entered Year inherited is Not leap Year");
		}
	}
	boolean palindrome(double num) {
		double num2=10;
		if(num2==num) {
			return true;
		}else {
			return false;
		}
	}
}

public class Inheritance {

	public static void main(String[] args) {
	Final a1=new Final();
	a1.leap(2020);	
	System.out.println("Overloaded Method Result= "+a1.palindrome(10.0));
	}
}
