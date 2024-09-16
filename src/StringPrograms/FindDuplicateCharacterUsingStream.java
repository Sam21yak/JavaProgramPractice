package StringPrograms;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateCharacterUsingStream {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "mynameissamyakjain";
		List<Character> charList = inputString.chars().mapToObj(c-> (char) c).collect(Collectors.toList());
		List<Character> dupChar = charList.stream().filter(c -> Collections.frequency(charList, c)>1).distinct().collect(Collectors.toList());
		System.out.println(dupChar);
	}
}
