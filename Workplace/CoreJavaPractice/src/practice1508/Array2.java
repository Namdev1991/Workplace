package practice1508;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,12,14,16,18,20,22,26,28,15,14,18};
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}System.out.println();
		System.out.println("-------------****------------------****-----------");
		//array shift to right
		for(int k=0;k<2;k++) {
		int last=array[array.length-1];
		for(int i=array.length-1;i>0;i--) {
			array[i]=array[i-1];
			}
		array[0]=last;
		}
		for(int a:array) {
			System.out.print(a+" ");
		}System.out.println();
		System.out.println("-------*****--------------****------***------**---");
		// Print array in reverse order
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}System.out.println();
		//Element on odd Position
		for(int i=0;i<array.length;i+=2) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		//even position Element
		for(int i=1;i<array.length;i+=2) {
			System.out.print(array[i]+" ");
		}
		
		
		//Largest Element of array
		Arrays.sort(array);
		System.out.println();
		System.out.println("--------***--**--------**");
		System.out.println(array[array.length-1]);
	for(int b:array) {
		System.out.print(b+" ");
	}System.out.println();
	int[] largest=Arrays.copyOfRange(array, array.length-1, array.length);
	for(int c:largest) {
		System.out.println(c);
	}
		
		}
	}

