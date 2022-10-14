package basicProgramsForInterview;

import java.util.HashMap;

public class OccuranceOrFrequency {
	public static void getchar(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char Array[] = str.toCharArray();

		for (char x : Array) {
			if(!String.valueOf(x).contains(" ")) {//----> This Loop is used for get Character count without spaces
			if (map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getchar("Add petrol");

	}

}
