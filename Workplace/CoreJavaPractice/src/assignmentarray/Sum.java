package assignmentarray;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] value= {10,12,14,12,11,16,12};
		int sum=0;
		for(int i=0;i<value.length;i++) {
			sum=sum+value[i];
		}
		System.out.println(" Sum of All Elements Present in Array "+sum);
	
		// Finding the 3Rd Largest Number
		Arrays.sort(value);
		for(int j=0;j<value.length;j++) {
			System.out.println(value[j]);
		}
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter No of Largest element Required After Sorting ");
		int n=ref.nextInt();
		
		
		if(n<=value.length) {
		int[] large=Arrays.copyOfRange(value, value.length-n, value.length-(n-1));
		for(int i=0;i<large.length;i++) {
			System.out.println("3 rd Largest Number "+large[i]);
		}
		}else {
			System.out.println("Enterd Numer is Wrong please Enter Valid Number");
		}
		
		
		
		//Smallest which one I want
		System.out.println("Entered number which smallest you Want");
		int m=ref.nextInt();
		if(m<value.length) {
		int[] small=Arrays.copyOfRange(value, m-1, m);
		for(int i=0;i<small.length;i++) {
			System.out.println(small[i]);
		}
		}else {
			System.out.println("Enterd Number is Wrong please Eneter Valid Number");
		}
		
	}

}
