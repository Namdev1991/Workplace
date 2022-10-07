package practice1508;

public class AsciiValue {
	//Swapping two Number
	static void swap(int num1,int num2) {
		int temp=num1;
		num1=num2;
		System.out.println("After swapping num1 = "+num1);
		num2=temp;
		System.out.println("After swapping num2 = "+num2);
	}
	//Swapping without using temp 
	static void swaptemp(int num1,int num2) {
		int sum=num1+num2;
		num1=sum-num1;
		System.out.println("num1 = "+num1);
		num2=sum-num2;
		System.out.println("num2 = "+num2);
	}
	static void evenodd(int num) {
		if(num%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd ");
		}
	}
	static void largestnumber(int num1,int num2,int num3) {
		if(num1>num2&&num1>num3) {
			System.out.println("num1 is largest Number");
		}else if(num2>num1&&num2>num3) {
			System.out.println("num2 is Largest Number");
		}else if(num3>num1&&num3>num2) {
			System.out.println("num3 is largest number");
		}else {
			System.out.println("All Values are same or Any Two Values are Same");
		}
	}
	static void leap(int year) {
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("Enter Year is Leap ");
		}else {
			System.out.println("Enter year is NonLeap");
		}
	}
	static void PosNeg(int num) {
		if(num>0) {
			System.out.println("The Enter Number is Positive");
		}else if(num<0) {
			System.out.println("The Enter Number is Negative");
		}else {
			System.out.println("Enter Number is Zero");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(10,15);
		swaptemp(20,40);
		evenodd(36);
		largestnumber(15,22,13);
		leap(2022);
		PosNeg(0);
		for(char letter='a';letter<='z';letter++) {
			int ascii=letter;
			System.out.println(ascii);
		}
	}

}
