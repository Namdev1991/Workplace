package operators;

public class VowelsAsignment {
	 static void checkVowels(char c1) {
		 if (c1=='a'|| c1=='e'||c1=='i'||c1=='o'||c1=='u') {
			 System.out.println("The Letter is Vowels");
			 }/*else if(c1=='e') {
				 System.out.println("The Letter is Vowels");
			 }else if(c1=='i') {
				 System.out.println("The Letter is Vowels");
			 }else if(c1=='o') {
				 System.out.println("The Letter is Vowels");
			 } else if(c1=='u') {
					 System.out.println("The Letter is Vowels");
			 }*/else {
				System.out.println("The Letter is consonents");
			 }
	 }

	public static void main(String[] args) {
		checkVowels('c');
		checkVowels('a');
	}

}
