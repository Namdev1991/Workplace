package assignmentarray;

import java.util.Arrays;

public class Large_Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {4,6,2,8,6,7,10,12,10,9,8,6,8};
		// Printing Largest 
		Arrays.sort(array);
		int[] arraylarge=Arrays.copyOfRange(array,array.length-1, array.length);
		for(int i=0;i<arraylarge.length;i++) {
			System.out.println("Largest Number "+ arraylarge[i]);
		}
		int[] arraysmall=Arrays.copyOf(array,1);
		for(int j=0;j<arraysmall.length;j++) {
			System.out.println("Smallest Number "+ arraysmall[j]);
		}
		//Print Element in Descending Order
		for(int k=array.length-1;k>=0;k--) {
			System.out.println(array[k]+" ");
		}
		System.out.println(" No of Element Present in Array "+array.length);
	}

}
