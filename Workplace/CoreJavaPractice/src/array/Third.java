package array;
class Second1{
	static void minimum() {
		int[] number={120,204,104,206};
		int x=number[0];
		for(int i=1;i<number.length;i++) {//120>204--False
										//120>104---True then x=104
										//104>206---False the final Answer
			if(x>number[i]) {
			x=number[i];
			}
		}
		System.out.println(" Minimum number "+x);
}
		void maximum(double number2[]) {
			double firstnumber=number2[0];
			for(int i=0;i<number2.length;i++) {
				if(firstnumber<number2[i]) {
					firstnumber=number2[i];
				}
			}System.out.println( " Maximum number = "+firstnumber );
		}
	}

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second1.minimum();
		double[] number2=new double[] {120.06,140,15,06.10,08.30,20,30,60,10,20};
		Second1 x1=new Second1();
		x1.maximum(number2);
		double y=number2[0];
		for(double z:number2) { //---------> By using FOR Each Loop
			if(y<z) {
				y=z;
			}
		}System.out.println(" number "+y);
	}

}
