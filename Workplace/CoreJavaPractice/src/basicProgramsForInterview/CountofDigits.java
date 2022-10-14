package basicProgramsForInterview;

public class CountofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1236548;
		int count=0;
		for(;num>0;) {
			num=num/10;
			count++;
		}System.out.println(count);
	}

}
