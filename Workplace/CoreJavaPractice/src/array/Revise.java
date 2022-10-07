package array;
import java.util.Arrays;
class Five{
	static int[] method() {
		//return new int[] {50,60,70};
		int[] num=new int[3];
		num[0]=30;
		num[1]=15;
		num[2]=24;
		return num;
	}
	
}
public class Revise {
		static int[] method1() {
		return new int[]{10,20,30};	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=Revise.method1();
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
			}
		System.out.println("-------*------------***-*---------------*-----------");
		int[] y=Five.method();
		for(int j=0;j<y.length;j++) {
			System.out.println(y[j]);
		}
		int[] number= {20,15,14,12,26,28,12,14,16,32};
		int[] numberclone=number.clone();
		System.out.println(Arrays.equals(number, numberclone));
		int[] number1=Arrays.copyOf(numberclone, 3);
		for(int a:number1) {
			System.out.println(a);
		}
		System.out.println("--------- * -------------------* --------****");
		for(int i=0;i<number1.length;i++) {
			System.out.println(number1[i]);
		}
		System.out.println("---------*------*------*");
		int[] number2=Arrays.copyOfRange(number, 6, 10);
		for(int c:number2) {
			System.out.println(c);
		}
		for(int i=0;i<number2.length;i++) {
			System.out.println(number2[i]);
		}
		Arrays.sort(number);
		for(int d:number) {
			System.out.println(d);
		}
		System.out.println(" ------ * -------- * ----------- * ------- ");
		for(int i=number.length-1;i>=0;i--) {
			System.out.println(number[i]);
		}
	}
}


