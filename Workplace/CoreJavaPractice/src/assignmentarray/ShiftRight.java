package assignmentarray;
import java.util.Scanner;
public class ShiftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ref=new Scanner(System.in);
		int[] number=new int[]{20,10,15,14,12,16,14};//14,20,10,15,14,12,16
		System.out.println("Printing Input Array");
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+ " ");
		}
		System.out.println();
		// Now I have to Shift element to right
		System.out.println("Enter the No of Time you want to shift ");
		int n=ref.nextInt();
		int size=number.length;
		for(int i=0;i<n;i++) {
		int last=number[size-1];
		for(int j=size-1;j>0;j--) {
			number[j]=number[j-1];
		}
		number[0]=last;
		}
		System.out.println("Printing Array after Shifting");
		for(int i=0;i<size;i++) {
			System.out.print(number[i]+" ");
		}
	}

}
