package StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsUsingMap {
	public static void main(String args[]) {
		String str1 = "My Name Is Samyak Jain";
		String str = str1.toLowerCase();
		HashMap<Character, Integer> vowels = new HashMap<>();
		for (Character c : str.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				if(vowels.containsKey(c)) {
					vowels.put(c, vowels.get(c)+1);
				}
				else {
					vowels.put(c,1);
				}
			}
		}
		for(Map.Entry entry: vowels.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
