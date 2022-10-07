package practice1508;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,12,14,16,18,20,22,26,28,15,14,18};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}System.out.println();
		//COpy All Elements of array 
		// 2 Ways to copy ---> 1) clone 2)--> use CopyOf
		int[] copyarray=array.clone();
		for(int a:copyarray) {
			System.out.print(a+" ");
		}System.out.println();
		System.out.println("-------*------*--------*-----------");
		int[] copyarray1=Arrays.copyOf(array, array.length);
		for(int i=0;i<copyarray1.length;i++) {
			System.out.print(copyarray1[i]+" ");
		}System.out.println();
		System.out.println("-----*****-----------****----------------***-");
		int[] freq=new int[array.length];
		int visited=-1;
		for(int i=0;i<array.length;i++) {
			int count=1;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
					freq[j]=visited;	
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=visited) {
				System.out.println(array[i]+" "+freq[i]);
			}
		}
	}
}
