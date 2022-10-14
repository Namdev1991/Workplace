package basicProgramsForInterview;

public class ReverseTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array[]= {10,20,14,16,18,20,14,12};
		System.out.println("Array ");
		for(int i=0;i<Array.length;i++) {
			System.out.print(+Array[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse Array");
		for(int i=Array.length-1;i>=0;i--) {
			System.out.print(Array[i]+" ");
		}
	}

}
