package assignmentarray;

public class Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40};//10,20,20
		int n=2;
		for(int k=0;k<2;k++) {
		int last=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
			arr[0]=last;
		}	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
