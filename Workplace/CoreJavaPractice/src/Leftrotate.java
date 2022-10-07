
import java.util.Scanner;
public class Leftrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=ref.nextInt();
		int[] num=new int[size];
		for(int k=0;k<size;k++) {
			System.out.println("enter elemtnt one by one");
			num[k]=ref.nextInt();
		}
		System.out.println("Enter Value of n ");
		int n=ref.nextInt();
		
		for(int j=0;j<n;j++) {
		int first=num[0];
		
		for(int i=0;i<num.length-1;i++) {
			num[i]=num[i+1];
		}
		num[num.length-1]=first;
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
	}

}
