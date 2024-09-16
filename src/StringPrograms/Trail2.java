package StringPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class Trail2 {
	 public static String removeDuplicates(String str) {
	        Set<Character> set = new LinkedHashSet<>();
	        StringBuilder result = new StringBuilder();

	        for (char c : str.toCharArray()) {
	            if (set.add(c)) {
	                result.append(c);
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String inputString = "hello world";
	        String outputString = removeDuplicates(inputString);
	        System.out.println("Original string: " + inputString);
	        System.out.println("String without duplicates: " + outputString);
	    }
}
