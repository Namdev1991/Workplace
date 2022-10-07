package assignment18_06_2022;

public class Countinteger {
	static void countint(int num) {
		int count=0;//1,2,3,4,5,6
		for(;num!=0;count++) {//123654,12365,1236,123,12.3,1.2
			num=num/10;//12365,1236,123,12.3,1.2,0
		}
		System.out.println("The digit count of Entered number "+count);
	}
	
		
	public static void main(String[] args) {
		countint(123654);

	}

}
