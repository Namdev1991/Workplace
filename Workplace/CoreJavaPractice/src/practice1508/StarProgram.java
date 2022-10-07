package practice1508;

public class StarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
				if(k<i) {
					System.out.print("*");
				}
			}System.out.println();
		}
	}

}
