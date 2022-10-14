package basicProgramsForInterview;

import java.util.Arrays;

public class SortingofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[]= {15,2,4,6,8,18,24,-10};
		
		for(int i=0;i<Array.length;i++) {
			for(int j=i+1;j<Array.length;j++) {
				if(Array[i]>Array[j]) {
					int temp=Array[i];
					Array[i]=Array[j];
					Array[j]=temp;
				}
			}
		}
		for(int i=0;i<Array.length;i++){
			System.out.println("Array["+i+"] = "+Array[i]);
		}
		System.out.println("--------**------***-----------*******-------");
			Arrays.sort(Array);
			for(int k=0;k<Array.length;k++) {
				System.out.println("Array["+k+"] = "+Array[k]);
			}
	}

}
