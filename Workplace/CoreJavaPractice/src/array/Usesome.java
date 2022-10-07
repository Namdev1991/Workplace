package array;

import java.util.Arrays;

public class Usesome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number=new int[] {20,40,30,40,50,60,72,74,76};// --------> Declaring array
		
		int[] number2=number.clone();   //------------------> Cloning Array Number and Saving in Number2
		
		int[] numbercopy=Arrays.copyOf(number2, 6);// -----------> Copying member of array-Number2 only first Six members
		// int[] numbercopy=Arrays.copyof(number2,number.length);------> for copy allmembers
		for(int x:numbercopy) {
			System.out.print(x+" ");
		}
		System.out.println(Arrays.equals(number, numbercopy));//--------> Check both are Equal or Not
		
		int[] numberrange=Arrays.copyOfRange(number,1,5);  //-----> Coping Element in Range
		for(int y:numberrange) {
			System.out.print(y +" ");
		}
		System.out.println(Arrays.equals(numbercopy, numberrange));// ------> Check both equal or not
		Arrays.sort(number); //----------> Sorting Number array in Ascending
		for(int i=number.length-1;i>=0;i--) {
			System.out.print(number[i]+" ");//Printing number in Descending Order
		}System.out.println();//  ---->      for New Line
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
	}
}
