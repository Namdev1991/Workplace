package practice2006;

public class Switch {
	static void Add(int num1,int num2,char op) {
		 int res;
		switch(op) {
		case '+':
			res=num1+num2;
			System.out.println("The Addition of  Num1& Num2 ="+res);
			break;
		case '-':
			res=num1-num2;
			System.out.println("The Substraction of Num1 & Num2 = "+res);
			break;
		default:
			System.out.println("The Entered Operation is Invalid");
		}
	}
	static void vowel(char x) {
		switch(x) {
		case 'A':
			System.out.println("The Entered Charactor is Vowels");
			break;
		case 'E':
			System.out.println("The Entered Charactor is Vowels");
			break;
		case 'I':
			System.out.println("The Entered Charactor is Vowels");
			break;
		case 'O':
			System.out.println("The Entered Charactor is Vowels");
			break;
		case'U':
			System.out.println("The Entered Charactor is Vowels");
			break;
		default:
			System.out.println("The Entered Charactor is Consonent");
		}
	}

	public static void main(String[] args) {
		//Add(35,20,'/');
		vowel('g');

	}

}
