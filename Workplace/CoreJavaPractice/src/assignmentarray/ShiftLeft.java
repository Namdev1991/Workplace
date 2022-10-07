package assignmentarray;
import java.util.Scanner;

public class ShiftLeft {
	static int[] array1=new int[] {12,14,16,18,20,22,14,12,11,14,16};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array2=array1.clone();				//Copying all member of Array1 into array2
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter Number how many times to ypu want shift"); //Taking input from user
		int num=ref.nextInt();												//Saving
		for(int i=0;i<num;i++) {
		int first=array2[0];
		for(int j=0;j<array2.length-1;j++) { // Rotate element by one
			array2[j]=array2[j+1];
		}
		array2[array2.length-1]=first;
		}
		System.out.println("Change array after Shifting");
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
	}
} 
