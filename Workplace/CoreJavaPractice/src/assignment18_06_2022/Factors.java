 package assignment18_06_2022;

public class Factors {
	static void fact(int num) {
		//for(int y=1;y<=num;y++)
		// for Negative 
		for(int y=-1;y>=num;y--)
		{
			if(num%y==0) {
				System.out.println("The Factors of Entered NUmber is = "+y);
			}
		
		}
	}

	public static void main(String[] args) {
		fact(-10); 

	}
}
