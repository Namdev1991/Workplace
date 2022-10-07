package starprogram;

class Sixstar{
	static void method() {
		for(int i=1;i<=5;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
				//if (j==i) {
					//System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				
			if(k==i) {	System.out.print("*");
			}
		}System.out.println();
	}
}
}
public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sixstar.method();
	}
}
