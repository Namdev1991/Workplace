package assignmentarray;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,2,4,4,2,5,2,2};
		for(int i=0;i<array.length-1;i++) {//-----> 10
			for(int j=i+1;j<array.length;j++) {//---->2
				if(array[i]==array[j]) {
					System.out.println(" Duplicate element is "+array[j]);
				}
			}
		}
	}
}
