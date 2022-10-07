package array;

public class Multiarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1= {{1,2,3},{8,9,6},{7,5,6}};
		int[][] array2= {{1,2,8},{2,6,9},{5,8,8}};
		int[][] array3=new int[array1.length][array1.length];
		
		System.out.println("Printing array 1");
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				System.out.print(array1[i][j]+" ");
			}System.out.println();
		}
		System.out.println("----*------*--------*-------");
		//Addition of 2 Arrays
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				array3[i][j]=array1[i][j]+array2[i][j];
				System.out.print(array3[i][j]+" ");
			}System.out.println();
		}
		System.out.println("---------**-------------*----------- ");
		//Multiplication of 2 arrays
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				array3[i][j]=0;
				for(int k=0;k<array3.length;k++) {
					array3[i][j]=array3[i][j]+array1[i][k]*array2[k][j];
				}
			}
		}
		System.out.println("Printing multiplied array");
		for(int i=0;i<array3.length;i++) {
			for(int j=0;j<array3.length;j++) {
				System.out.print(array3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
