package practice1508;

public class MultiarrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1= {{5,6,8},{7,8,9},{5,6,7}};
		int[][] array2= {{4,6,5},{5,8,7},{6,5,8}};
		int[][] array3=new int[array1.length][array1.length];
		
		//Addition of Array
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				array3[i][j]=array1[i][j]+array2[i][j];
				System.out.print(array3[i][j]+" ");
			}System.out.println();
		}
		//Multiplication
		for(int i=0;i<array1.length;i++) {
			for(int j=0;j<array2.length;j++) {
				array3[i][j]=0;
				for(int k=0;k<array3.length;k++) {
					array3[i][j]=array3[i][j]+array1[i][k]*array2[k][j];
					
				}
			}
		}
		for(int i=0;i<array3.length;i++) {
			for(int j=0;j<array3.length;j++) {
				System.out.print(array3[i][j]+" ");
			}System.out.println();
		}
	
	}

}
