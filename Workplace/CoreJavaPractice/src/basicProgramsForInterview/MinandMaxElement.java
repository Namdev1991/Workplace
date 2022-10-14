package basicProgramsForInterview;

public class MinandMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Array1= {10,20,30,15,14,16,12,10,15,14,8,6,14,24};
		int min=Array1[0];
		int max=Array1[0];
		for(int i=0;i<Array1.length;i++) {
			if(Array1[i]<min) {
				min=Array1[i];
			}
			if(Array1[i]>max) {
				max=Array1[i];
			}
			
		}
		System.out.println(min);
		System.out.println(max);
		
	}

}
