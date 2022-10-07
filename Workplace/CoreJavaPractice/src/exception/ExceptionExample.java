package exception;

import java.rmi.AlreadyBoundException;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		int num1=0;
		try {
			int c=num/num1;
		}catch(ArrayStoreException e) {
		System.out.println(e);	
		}catch(ArithmeticException d) {
		System.out.println(d.getMessage()+"  eebdbejd");
		}finally {
			System.out.println("I am always Execute wheather Exception raised or not");
		}
	}
}
