package practice1508;

public class Sumofnaturalnumber {	
	
	//Count number of Digit in any Value
		static void count(int num) {
			int count=0;
			for(;num!=0;count++) {
				num=num/10;
			}System.out.println(count);
		}
	
		//Reverse Number
		static void reverse(int num) {
			int sum=0;
			for(;num>0;) {
				int x=num%10;
				sum=sum*10+x;
				num=num/10;
			}System.out.println(sum);
		}
		static void prime(int num) {
			int temp=0;
			for(int i=2;i<num-1;i++) {
			if(num%i==0) {
				temp=0+1;
			}
			}
			if(temp>0) {
				System.out.println("The Number is Non Prime");
			}else {
				System.out.println("The Number is Prime");
			}
			}
		static void ArmStrong(int num) {
			int temp=num;
			int num2=num;
			int power=0;
			for(;num!=0;power++) {
				num=num/10;
			}
			double result=0;
			while(temp>0) {
				int rem=temp%10;
				result=result+Math.pow(rem, power);
				temp=temp/10;
			}
			if(num2==result) {
				System.out.println("The Enter Number is ArmStrong Number");
			}else {
				System.out.println("The Enter Number is Not ArmStrong Number");
			}
		}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count(1236458);
		reverse(56849);
		prime(7);
		ArmStrong(153);
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		
	}

}
