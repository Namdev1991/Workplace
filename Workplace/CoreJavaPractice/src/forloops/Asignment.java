package forloops;

public class Asignment {

	static void uppercase() {
		for(char x='A';x<='Z';x++) {
			System.out.print(x);
		}
	}
	static void lowercase() {
		for(char y='a';y<='z';y++) {
			System.out.print(y);
			
		}
	}
	public static void main(String[] args) {
		uppercase();
		lowercase();
	}

}
