package basicProgramsForInterview;

public class FibonachySeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int count=10;
		int num3;
		System.out.print(num1+" "+num2);
		
		for(int i=1;i<count-1;i++) {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
	}

}
