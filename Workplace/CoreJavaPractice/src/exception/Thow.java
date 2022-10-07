package exception;

public class Thow {

	static void userd(int num) {
		try{if(num<10) {
			throw new ArithmeticException("Please enter Valid Number");
		
			
		}else {
			System.out.println("number is greater than 10");
		}
		}catch(ArithmeticException obj) {
			System.out.println(obj.getMessage());
		}
	}
	static void method(int num)  {
		userd(5);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thow x1=new Thow();
		
			method(10);
	}
}
