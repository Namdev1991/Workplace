package operators;

public class LargestNumber {
	
	static void checkLargest(int num1,int num2,int num3) {
		if(num1>num2&& num1>num3) {
			System.out.println("The Number 1 is Greater Than Number2 & Number 3 ");
		} else if(num2>num3 && num2>num1) {
			System.out.println("The Number 2 is Greater Than Number 1 & Number 3");
		}else if(num3>num2 && num3>num1) {
			System.out.println("The Number 3 is Greater Than Number 2 & Number 3");
		}else {
			System.out.println("All Numbers are Same");
		}
	}

	public static void main(String[] args) {
	checkLargest(45,50,60);	
	checkLargest(45,45,45);
	}

}
