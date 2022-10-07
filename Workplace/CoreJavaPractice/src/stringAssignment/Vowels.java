package stringAssignment;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Namshedidgydyg";

		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| 
					str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
					str.charAt(i) == 'u')

				System.out.println("Given string contains " + 
						str.charAt(i)+" at the index " + i);
		}
	}
}	






//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//				 vowel=ch;
//			}
//		}System.out.println("vowel in String = "+vowel);
//		



