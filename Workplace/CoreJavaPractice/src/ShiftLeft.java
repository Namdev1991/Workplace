
import java.util.Arrays;
import java.util.Scanner;
public class ShiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {10,15,16,201,120,12,14,6,8,12,20};
		System.out.println("Input Array ");
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of times You Want to shift number");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
		int first=number[0];
		for(int j=0;j<number.length-1;j++) {
			number[j]=number[j+1];
		}
		number[number.length-1]=first;
		}
		System.out.println(" After Changing position of Array Elements");
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println();
		System.out.println(" printing ELements Present on Even Number Position ");
		for(int i=1;i<number.length;i+=2) {
			System.out.print(number[i]+" ");
		}
		System.out.println();
		System.out.println("Printing Elements present on Odd position");
		for(int i=0;i<number.length;i+=2) {
			System.out.print(number[i]+" ");
		}
		System.out.println();
		Arrays.sort(number);
		//System.out.println(" After Sorting ");
		//for(int i=0;i<number.length;i++) {
		//	System.out.print(number[i]+" ");
		//}
		int[] largest=Arrays.copyOfRange(number, number.length-1,number.length);
		System.out.println();
		for(int i=0;i<largest.length;i++) {
			System.out.println("Largest Number "+largest[i]);
		}
	}
	

}
