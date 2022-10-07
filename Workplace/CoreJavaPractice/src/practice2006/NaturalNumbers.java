package practice2006;

public class NaturalNumbers {
	void natural(int num) {
		int sum=0;
		for(int y=1;y<=num;y++) {
			sum=sum+y;
		}
		System.out.println("The Addition of Natural Numbers upto "+num+" is = "+sum);
	}

	public static void main(String[] args) {
		NaturalNumbers a=new NaturalNumbers();
			a.natural(100);

	}

}
