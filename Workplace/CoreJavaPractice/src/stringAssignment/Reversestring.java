package stringAssignment;
import java.util.*;
public class Reversestring {

	public static void main(String[] args) {
//	System.out.println("Enter the String");
//		Scanner ref=new Scanner(System.in);
//		String st=ref.next();
//		StringBuffer str=new StringBuffer(st);
//		System.out.println(str.reverse());
		String st="Namdev";
		String str="will you marry me";
		
//		for(int i=st.length()-1;i>=0;i--) {
//			System.out.print(st.charAt(i));
//		}
		String[] split=str.split(" ");
		String reversestring="";
		for(int i=0;i<split.length;i++) {
			String word=split[i];
			String reverseword="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseword=reverseword+word.charAt(j);
			}
			reversestring=reversestring+reverseword+" ";
		}
		System.out.println("ReverseString = "+reversestring);
		
		String str2="I love you";
		String[] split2=str2.split(" ");
		for(int i=split2.length-1;i>=0;i--) {
			System.out.print(split2[i]+" ");
		}
	}
}
	