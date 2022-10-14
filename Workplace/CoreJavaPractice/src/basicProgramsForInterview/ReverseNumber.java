package basicProgramsForInterview;

public class ReverseNumber {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=125468;
		int a=num;
		int sum=0;
		for(;num>0;) {
			int x=num%10;
			sum=sum*10+x;
			num=num/10;
		}
		System.out.println("Reverese Number = "+sum);
		if(a==sum) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is Not Palindrome");
		}
	}

}
