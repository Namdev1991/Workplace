package stringAssignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MoM";
		
		String output="";
		for(int i=str.length()-1;i>=0;i--) {
			output=output+str.charAt(i);
		}
		if(str.equalsIgnoreCase(output)) {
			System.out.println("String are Palindrome");
		}else {
			System.out.println("Strings are not Palindrome");
		}
		
		
	}

}
