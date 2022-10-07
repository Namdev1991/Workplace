package practice240622;

public class Mixed1 {
int num1=25;
static int num2=30;

static void reverse(int num3) {
	int sum=0;
	int a=num3;
	for (;num3!=0;) {
		int x=num3%10;
		sum=sum*10+x;
		num3=num3/10;
	}
	System.out.println("The Reverese Number of "+a+" is = "+sum);
	
	if (a==sum) {
		System.out.println("The Num3 is Palindrome ");
	}else {
		System.out.println("The Num3 is Not Palindrome");
	}
}
void armstrong(int num4) {
	int count=0;
	int a1=num4;
	while(num4>0) {
		num4=num4/10;
		count++;
	}
	System.out.println("The No of Digits in NUM4 = "+count);
	num4=a1;
	int sum1=0;
	while(num4>0) {
		int rem=num4%10;
		sum1=(int) (sum1+Math.pow(rem,count));
		num4/=10;
	}
	if (a1==sum1) {
		System.out.println("The no = "+a1+" is Armstrong Number ");
	}else {
	System.out.println("The No is Not Armstrong Number");
	}
}
Mixed1(int num5,int num6){
	int num1=5;
	int add=num5+num6;
	int add1=add*num1;
	System.out.println("The Addition Of Constructor NUM 5 & NUM 6 "+add1);
 num1=this.num1;
	System.out.println("The Num1 = "+num1);
}
void display(int num1) {
	this.num1=num1;
	System.out.println("Updated Value of num1  "+this.num1);
	
}

	public static void main(String[] args) {
		reverse(154);
		Mixed1 b=new Mixed1(50,60);
		b.armstrong(153);
		b.num1=36;
		System.out.println("The Updated Value of Number 1 = "+b.num1);
		b.display(50);
		}

}
