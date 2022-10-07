
public class ShiftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values= {12,14,6,8,7,12,14,15,16,12,14};
		for(int i=0;i<values.length;i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
		int last=values[values.length-1];
		System.out.println(last);
		for(int i=1;i<values.length-1;i++) {
			values[i+1]=values[i];
		}
		//values[values[0]]=last;
		for(int i=0;i<values.length;i++) {
			System.out.print(values[i]);
		}
	}

}
