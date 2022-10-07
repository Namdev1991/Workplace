package array;
class First1{
	//double[]num= {12,15,16,18,20};
	//double[]num2=new double[] {20,25,30,36,37,38,39};
	static void method(double num[]) {
		double sum=0;
		double average;
		for(double x:num) {
			sum=sum+x;
		}System.out.println(" Sum of Numbers "+sum);
		average=sum/num.length;
		System.out.println(" Average of Numbers = "+average);
	}
	static void method1(double num2[]) {
		double sum=0;
		double average;
		for(double x:num2) {
			sum=sum+x;
		}System.out.println(" Sum of Numbers "+sum);
		average=sum/num2.length;
		System.out.println(" Average of Numbers = "+average);
	}
	 void method2(double num2[]) {
		double sum=0;
			for(int i=0;i<num2.length;i++) {
			sum=sum+num2[i];
		}System.out.println(" Sum of Number "+sum);
	}
}
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[]num= {12,15,16,18,20};
		double[]num2=new double[] {20,25,30,36,37,38,39};
		First1.method(num);
		First1.method1(num2);
		First1 x1=new First1();
		x1.method2(num2);
	}

}
