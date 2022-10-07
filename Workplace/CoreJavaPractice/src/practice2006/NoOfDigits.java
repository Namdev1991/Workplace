package practice2006;

public class NoOfDigits {
static void digits(int num) {
	int count=0;
			for(;num!=0;count++) {
				num=num/10;
			}
			System.out.println("The digits of entered value = "+count);
	}
void reverse(int a) {
	int y=a;
	int sum=0;
	for (;a>0;) {
		int x=a%10;
		sum=sum*10+x;
		a=a/10;
	}
	System.out.println("Reverse number of "+sum);
	if (y==sum) {
		System.out.println("The Entered no is Palindrome");
	}else {
		System.out.println("The Entered no is NOT Palindrome");
	}
}

	


	public static void main(String[] args) {
		digits(6258);
		NoOfDigits z=new NoOfDigits();
		z.reverse(8515);
	}

}
