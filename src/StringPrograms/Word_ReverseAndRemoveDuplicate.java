package StringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Word_ReverseAndRemoveDuplicate {
	public static void main(String[] args) {

		String str = "my name is samyak jaini mm yy isis";
		StringBuilder reverseString = new StringBuilder();
		String[] strarr = str.split(" ");
		for (String s : strarr) {
			StringBuilder reverseWord = new StringBuilder(s);
			String revWord = reverseWord.reverse().toString();
			StringBuilder remdup = new StringBuilder();
			Set<Character> set = new LinkedHashSet<>();
			for (Character c : revWord.toCharArray()) {
				if (set.add(c)) {

					remdup.append(c);
				}
			}
			reverseString.append(remdup).append(" ");
		}
		System.out.println(reverseString.toString());

	}

}
