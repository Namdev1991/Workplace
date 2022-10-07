package assignment18_06_2022;

public class SumofNatural {
	static void natural(int x) {
		int sum=0;
		for(int y=0;y<=x;y++) {
			sum=sum+y;
		}
		System.out.println("The addition of first "+x+" is ="+sum );
	}
	 void even(int x) {
		int sum2=0;
		for(int i=0;i<=x;i+=2) {
			sum2=sum2+i;
		}
		System.out.println("The Addition of even numbers upto "+x+"is = "+sum2);
	}
	 static void odd(int x) {
		 int sum3=0;
		 for (int j=1;j<=x;j+=2) {
			 sum3=sum3+j;
		 }
		 System.out.println("The Addition of odd numbers upto "+x+ "is = "+sum3);
	 }

	public static void main(String[] args) {
		natural(10);
		SumofNatural a=new SumofNatural();
		a.even(100);
		odd(100);
	}

}
