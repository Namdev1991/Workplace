package Scannerclass;
import java.util.Scanner;

public class Basic {
	static void method(int num1,int num2,char op) {
		switch(op) {
		case'+':System.out.println(num1+num2);
		break;
		case'-':System.out.println(num1-num2);
		break;
		case'*':System.out.println(num1*num2);
		break;
		default:System.out.println(num1/num2);
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ref=new Scanner(System.in);
		String Name;
		int EMPID;
		double Salary;
		String name;
		System.out.println("Enter Name Of Employee ");
		Name=ref.next();
		System.out.println("Enter Employee ID ");
		EMPID=ref.nextInt();
		System.out.println(" Enter Salary ");
		Salary= ref.nextDouble();
		System.out.println(" Name = "+Name);
		System.out.println(" Emp ID = "+EMPID);
		System.out.println(" Salary = "+Salary);
		System.out.println("Enter num1");
		int num1=ref.nextInt();
		System.out.println(" Enter num2");
		int num2=ref.nextInt();
		System.out.println(" Enter Operation");
		char op=ref.next().charAt(0);
		
		Basic.method(num1, num2, op);
		//name=ref.nextLine();
		
	}

}
