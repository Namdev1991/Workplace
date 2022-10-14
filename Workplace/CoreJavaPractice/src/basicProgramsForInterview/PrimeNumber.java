package basicProgramsForInterview;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=28;
		int count=0;
		for(int i=2;i<=number-1;i++) {
			if (number%i==0){
				count=count+1;
			}
		}
		if(count>0) {
			System.out.println("The number is Not Prime");
		}else {
			System.out.println("The number is Prime");
		}
	}

}
