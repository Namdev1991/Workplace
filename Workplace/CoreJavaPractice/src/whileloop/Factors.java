package whileloop;

public class Factors {
	static void factor(int num) {
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				System.out.println("The Factors of Number  "+num+" is Equal "+i);
			}i++;
		}
	}

	public static void main(String[] args) {
		factor(10);
	}
}
