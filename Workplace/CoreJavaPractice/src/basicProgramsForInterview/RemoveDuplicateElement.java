package basicProgramsForInterview;

import java.util.Arrays;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,14,12,10,15,16,14,15,16,12,11,10};
		Arrays.sort(array);
		for(int a:array) {
			System.out.println(a);
		}
		int j=0;
		int temp[] =new int[array.length];
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1]) {
				temp[j++]=array[i];
			}
		}temp[j++]=array[array.length-1];
		
		System.out.println("--------**----------***--------");
		for(int k=0;k<j;k++) {
			System.out.println(temp[k]);
		}
	}

}
