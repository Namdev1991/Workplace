package array;

public class Multi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num= {{1,4,6},{2,4,8},{1,8}};
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}System.out.println();
		}
	}
}
