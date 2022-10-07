package forloops;

public class Reversenumber {
	static void reverse(int a) {
		int sum=0;//To Make A number systems
		for( ;a>0;) {
			int x=a%10;// To Break the number//9,6,5,2,1
			sum=sum*10+x;//96521
			a=a/10;//1
			}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Reversenumber.reverse(12569);//1256 mod 9
		
	}

}