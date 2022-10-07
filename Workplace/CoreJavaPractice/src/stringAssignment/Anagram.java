package stringAssignment;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Mother In Law";
		String str2="Hitler Woman";
		String str3=str1.replaceAll(" ","");
		String str4=str2.replaceAll(" ", "");
		if(str3.length()!=str4.length()) {
			System.out.println("Not Possible to make Anagram");
		}
		char[] array1=str3.toLowerCase().toCharArray();
		char[] array2=str4.toLowerCase().toCharArray();
		
		Arrays.sort(array1);
		for(char a:array1) {
			System.out.print(a);
		}System.out.println();
		Arrays.sort(array2);
		for(char b:array2) {
			System.out.print(b);
		}System.out.println();
		
		if(Arrays.equals(array1, array2)) {
			System.out.println("String are Anagram");
		}else {
			System.out.println("String are Non Anagram");
		}
	}

}
