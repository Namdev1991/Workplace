package array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int[] array=new int[5];
//		
//		for(int i=0;i<array.length;i++) {
//			System.out.println("Enter Array Element["+i+"]");
//			array[i]=sc.nextInt();
//			
//		}
		
		int[] array1= {10,12,14,16,18,20};
		System.out.println(array1.length);
		for(int x:array1) {
			System.out.print(x+" ");
		}System.out.println();
		int[] array=array1.clone();
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}System.out.println();
		System.out.println(Arrays.equals(array, array1));//Check On the basis of Value of array
		int[] arraycopy=Arrays.copyOf(array, 4);
		for(int y:arraycopy) {
			System.out.print(y+" ");
		}System.out.println();
		int[] arraycopyrange=Arrays.copyOfRange(array, 2, 6);
		for(int z:arraycopyrange) {
			System.out.print(z+" ");
		}System.out.println();
		Arrays.sort(array1);
		for(int a:array1) {
			System.out.print(a+" ");
		}System.out.println();
		System.out.println(Arrays.hashCode(array));
	
	}

}
