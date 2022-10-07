package constructor;
class A {
	int age;
	double salary;
	int EMPID=35;
	A(int x){
		age=x;
		System.out.println("The Value of Constructor A Age = "+age);
		System.out.println("The Value of EMPID = "+EMPID);
		
	}
	A(int y,int z){
		this(25);
		int res=y/z;
		age=10;
		System.out.println("The result of "+res);
	}
		
	
	void add(int num1) {
		age=35;
		int res=age*num1;
		System.out.println("The Value of Salary Before Initialization = "+salary);
		salary=35000;
		System.out.println("The Value of age * num1 in add method = "+res);
		System.out.println("The Value of Local Variable Age = "+age);
		System.out.println("The Value of NON STATIC Variable Age = "+this.age);
		System.out.println("The Value of NON STATIC Variable Salary = "+this.salary);
	}
}

public class Mixed {

	public static void main(String[] args) {
		A a=new A(10);
		a.add(10);
		a.age=15;
		A b=new A(20,12);
	
	}

}
