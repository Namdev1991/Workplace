package stringAssignment;
import java.util.Scanner;
public class UpperLowerPercent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.next();
		double uppercase=0;
		double lowercase=0;
		double digit=0;
		double others=0;
		double total=str.length();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				uppercase++;
			}else if(Character.isLowerCase(ch)) {
				lowercase++;
			}else if(Character.isDigit(ch)) {
				digit++;
			}else {
				others++;
			}
		}
		System.out.println("Count of Digit = "+digit);
		double percentageofuppercase=(uppercase*100)/total;
		double percentageoflowercase=(lowercase*100)/total;
		double percentageofdigit=(digit*100)/total;
		double percentageofothers=(others*100)/total;
		System.out.println(percentageofuppercase+"%");
		System.out.println(percentageoflowercase+"%");
		System.out.println(percentageofdigit+"%");
		System.out.println(percentageofothers+"%");
	}

}
