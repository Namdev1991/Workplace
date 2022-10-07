package whileloop;

public class NoofDigit {
static void digit(int num) {
	int count=0;
	while(num!=0) {
		num=num/10;
		count++;
	}
	System.out.println("No of digits of entered "+num+" is = "+count);
}
void reverse(int num) {
	int b=num;
	int sum=0;
	while(num>0) {
		int x=num%10;
		sum=sum*10+x;
		num/=10;
	}
		System.out.println("Reverse no of "+b+" is = "+sum);	
		if(b==sum) {
			System.out.println("The Entered number "+b+" is a Palindrome Number ");
		}else {
			System.out.println("The Entered Number is not Palindrome Number");
		}
}
	public static void main(String[] args) {
	digit(2536);
	NoofDigit a=new NoofDigit();
	a.reverse(2552);
	}
}
