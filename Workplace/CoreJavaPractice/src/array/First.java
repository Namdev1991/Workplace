package array;

public class First {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[5];//Datatype[] Arrayname=new datatype[size];
		num[0]=20;
		num[1]=30;
		num[2]=20;
		num[3]=25;
		num[4]=30;
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]); 
		System.out.println(num[3]);
		System.out.println(num[4]);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("-------*----------*-------------*--------------*----------");
		num[0]=60;
		num[1]=80;
		num[2]=75;
		for(int x:num) { //---------> For Each Loop LHS:RHS   
			System.out.println(x);
		}
	}
}
