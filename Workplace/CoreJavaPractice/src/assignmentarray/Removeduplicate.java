package assignmentarray;

import java.util.Arrays;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,4,4,6,4,5,8,9,7,6,4,2,1,6};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		int j=0;
		for(int i=0;i<num.length-1;i++) {
			if(num[i]!= num[i+1]) {
				num[j++]=num[i];
			}
		}num[num.length-1]=num[j++];
	}
}
