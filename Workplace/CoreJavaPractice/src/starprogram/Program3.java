package starprogram;
class Fivestar{
	static void method() {
		for(int i=1;i<=10;i++) {
			for(int j=9;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
				if(k<i) {
					System.out.print("*");
				}
			}
//			
			System.out.println();
		}
	}
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fivestar.method();

	}

}
