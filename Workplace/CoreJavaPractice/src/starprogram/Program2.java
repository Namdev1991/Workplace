package starprogram;
class Threestar{
	static void method1() {
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
class Fourstar{
	void method2() {
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}for(int k=4;k>=i;k--) {
			System.out.print("*");
			}System.out.println();
		}
	}	 
}

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threestar.method1();
		Fourstar x1=new Fourstar();
		x1.method2();
	}
}

