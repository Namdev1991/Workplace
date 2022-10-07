
import java.util.Arrays;
import java.util.Scanner;
public class ArrayP2707 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner Ref=new Scanner(System.in);
		System.out.println("Enter the value of array size");
		int size=Ref.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter element of Array");
			array[i]=Ref.nextInt();  
		}
		int[] array1=array.clone();
		for(int x:array1) {
			System.out.println(x);
		}
		 */
		int[] array= {10,14,16,25,12,22};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("Length of array = "+array.length);
		System.out.println();
		int[] array1=array.clone();
		for(int x:array1) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Length of clone array = "+array1.length);
		int[] array2=Arrays.copyOf(array1, 3);//It will copy only 0,1,2 Index Elemets
		for(int y:array2) {
			System.out.print(y+" ");
		}
		System.out.println();
		int[] array3=Arrays.copyOfRange(array1, 0, 3);
		for(int z:array3) {
			System.out.print(z+" ");
		}
		System.out.println();
		System.out.println(Arrays.equals(array, array1));//Based on the Value  
		System.out.println(array2==array3);//Based on Address
		Arrays.sort(array);
		for(int a:array) {
			System.out.print(a+" ");
		}

	}
}
