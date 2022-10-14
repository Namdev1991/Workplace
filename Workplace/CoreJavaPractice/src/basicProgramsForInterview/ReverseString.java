package basicProgramsForInterview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i have to do it";
		String st="";
		int num=str.lastIndexOf("t");//To find the length of String without using Length method
		int length=num+1;
		System.out.println(length);
		
		for(int i=str.length()-1;i>=0;i--) {
			st=st+str.charAt(i);
		}
		System.out.println(st);
		
		String[] Array=str.split(" ");
		for(int i=Array.length-1;i>=0;i--) {
			System.out.print(Array[i]+" ");
		}
	}

}
