package stringAssignment;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ststrslaha";
		int freq;
		int visited=-1;
		for(int i=0;i<str.length()-1;i++) {
			int count=1;
			for(int j=1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					
				}
			}
		}
	} 
}
