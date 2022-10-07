package starprogram;
class Onestar{
	static void method1() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
class Twostar{
	void method() {
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Onestar.method1();
		Twostar x1=new Twostar();
		x1.method();
	}

}
