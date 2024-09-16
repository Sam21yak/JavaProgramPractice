package StringPrograms;

import java.util.HashMap;
import java.util.Set;

public class CountDuplicateCharacters {
	public static void main(String args[]) {
		String str1 = "My Name Is Samyak Jain";
		String str = str1.toLowerCase();
		HashMap<Character, Integer> charCount = new HashMap<>();
		for(Character c: str.toCharArray()) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			}
			else {
				charCount.put(c, 1);
			}
		}
		Set<Character> dupCount = charCount.keySet();
		for(Character dup: dupCount)
		{
			System.out.println(dup+ " : "+charCount.get(dup));
		}
	}
}
