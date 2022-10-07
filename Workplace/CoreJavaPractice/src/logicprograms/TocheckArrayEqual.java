package logicprograms;

import java.util.Arrays;

//Question- Write a Program to check a Array is Equal or Not

public class TocheckArrayEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,12,14,16,18};
		int[] arr1= {20,30,12,14,16,20,12};
		int[] arr2=arr.clone();
		
		System.out.println(Arrays.equals(arr, arr2));
	}
}
