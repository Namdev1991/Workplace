package Typecasting;
class Down{
	void Animal() {
		System.out.println(" Animal of Down");
	}
	void Dog() {
		System.out.println(" Dog of Down");
	}
}

public class Downcasting extends Down {
	void Animal() {
		System.out.println("Animal of Downcasting");
	}
	void cat() {
		System.out.println(" Cat of Downcasting ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Downcasting x1=new Down();//Implicit Down casting is not Possible
		Down x1=new Downcasting(); // First create a Upcasting
		Downcasting x2=(Downcasting)x1;// explicit Downcasting is Possible
		x2.Animal();
		x2.Dog();
		x2.cat();
		x1.Animal();// Calling by Upcasted object refference
	}
}
