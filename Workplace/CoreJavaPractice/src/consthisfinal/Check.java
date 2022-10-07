package consthisfinal;

public class Check {

	public static void main(String[] args) {
		Check1.method1();

	}
	

}
class Check1{
	static final int x;
	final double y;
	static {
		x=15;
		System.out.println("Static Final Variable initialize in Static Block "+x);
	}
	{
		y=20;
		System.out.println("Non Static Final Variable Initialize in Non Static Block "+y);
	}
	static void method1() {
		Check1 a1= new Check1();
		double sum=x+a1.y;
		System.out.println("Result of Method 1 = "+sum);
	}
	
public static void main(String[]args) {
	
}
}
