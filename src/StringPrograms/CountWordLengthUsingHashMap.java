package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWordLengthUsingHashMap {
	public static void main(String args[]) {
		String str1 = "My Name Is Samyak Jain";
		String[] strarray = str1.split(" ");
		HashMap<String, Integer> strsize = new HashMap<>();
		for (String s : strarray) {
			strsize.put(s, s.length());
		}
		for (Map.Entry entry : strsize.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
