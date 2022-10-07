package practice2006;

public class FactorsofNumbers {
	static void factor(int num) {//for positive Numbers
		for (int i=1;i<=num;i++) {
			if (num%i==0) {
				System.out.println("The Factors of Entered No is = "+i);
			}
			}
		}
	void negative(int a) {
		for (int x=-1;x>=a;x--) {
			if(a%x==0) {
				System.out.println("The Factors of Entered No is =  "+x);
			}
		}
	}

	public static void main(String[] args) {
		factor(10);
		FactorsofNumbers c=new FactorsofNumbers();
		c.negative(-50);
	}
}
