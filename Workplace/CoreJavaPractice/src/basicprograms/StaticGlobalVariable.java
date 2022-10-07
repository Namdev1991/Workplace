package basicprograms;

public class StaticGlobalVariable {
	static int age;  
	static char grade;
	static boolean B;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Age = "+StaticGlobalVariable.age);
System.out.println("A = "+grade);
System.out.println("B= "+B);

/*ReinitialiZation of Static Global Variable */

age=15;
grade='A';
B=true;
System.out.println("Age = "+StaticGlobalVariable.age);
System.out.println("A = "+grade);
System.out.println("B= "+B);

		
	}

}
