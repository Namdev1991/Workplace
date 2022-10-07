package operators;

public class LeapYear {
void check(double year) {
	/*if (year%4==0 && year%100!=0 ||year%200==0 ) {
		System.out.println("The year is Leap");
	}else {
		System.out.println("The Year is Not Leap");
	}*/
	if(year%4==0) {
		if(year%100!=0) {
			System.out.println("The Year Is Leap Year");
		}else {
			System.out.println("The Year Is NOT LEAP YEAR");
		}
	}
		else if(year%400==0) {
			System.out.println("The Year is LEAP YEAR");
		}else {
			System.out.println("THE YEAR IS NOT LEAP YEAR");
	}
}
	public static void main(String[] args) {
	LeapYear x=new LeapYear();
	x.check(1995);
	x.check(300);
	x.check(2020);
	}

}
