package demo1;


public class PracticeGlobalvariabl3 {
	int a,b;

	public static void main(String[] args) {
		System.out.println("START OF PROGRAM");
		PracticeGlobalvariabl3 obj1=new PracticeGlobalvariabl3();
		int sum=obj1.a+obj1.b;
		System.out.println("sum="+sum);
		obj1.a=100;
		obj1.b=200;
		System.out.println("sum="+sum);
		sum=obj1.a+obj1.b;
		System.out.println("sum="+sum);
		System.out.println("END OF PROGRAM");
	}

}
