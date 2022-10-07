package array;
class Multi11{
	int[] num= {2,1,4,4,1,8,9,2,4,6};
	double sum=num[0];
	 void method() {
	for(int i=1;i<num.length;i++) {
		sum=sum*num[i];
	}
	System.out.println(" Multiplication "+sum);
	}
}

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] number=new int[4][4];
		number[0][0]=4;
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				System.out.print(number[i][j]);
			}
			System.out.println();
		}
		Multi11 x1=new Multi11();
		x1.method();
	}
}

