package practice;

public class Asciivalue {
	void asc() {
		/*int asci=letter;
		return asci;
	}*/
	for(char i= 'A';i<='Z';i++) {
		int ascii=i;
		System.out.println("ASCII Value of Alphabets ="+ascii);
	}
	}

	public static void main(String[] args) {
		Asciivalue x=new Asciivalue();
x.asc();
	}

}
