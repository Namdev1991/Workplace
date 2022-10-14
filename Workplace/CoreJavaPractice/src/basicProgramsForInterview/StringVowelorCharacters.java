package basicProgramsForInterview;

public class StringVowelorCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The King of cricket is Virat Kohli";
		String st = str.toLowerCase();
		int Vcount = 0;
		int Ccount = 0;
		int SpaceCount=0;

		for (int i = 0; i < str.length(); i++) {

			if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
					|| st.charAt(i) == 'u') {	
				Vcount++;
			} else if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				Ccount++;
			}else if(st.charAt(i)==' ') {
				SpaceCount++;
			}
		}
		System.out.println("Total Length of Charactors = "+str.length());
		System.out.println("Count of Vowels = "+Vcount);
		System.out.println("COunt of Charactors = "+Ccount);
		System.out.println("Space count = "+SpaceCount);

	}
}
