package assignment18_06_2022;

public class AsciiValue {// american standard code for information interchange (ASCII)
	
	//static void Asci() {
		//for(char x='A';x<='Z';x++) {
			//int ascii=x;
			//System.out.println("The ASCII Value of Charactor  "+ x + " is = "+ascii);
		//}
		
	//}
	
	//Second Method to Calculate Asc VAlue of Entered Charactor
	static int Asci(char alphabet) {
		int ascii=alphabet;
		return ascii;
	}

	public static void main(String[] args) {
		//Asci(); ** Method Calling if Void 
		System.out.println("The Value of entered Charactor is = "+Asci('X'));
		}

}
