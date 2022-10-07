package whileloop;

public class PrimeNumber {
	static void prime(int num) {
		int count=0;int i=1;
		while(i<=num) {
	
			if(num%i==0) {
				
				count++;
			}i++;
		}
		if (count==2) {
		System.out.println("The number is Prime & Number = "+num);
		}else {
			System.out.println("The number is NON Prime");
		}
		
	}

	public static void main(String[] args) {
		prime(7);

	}

}
