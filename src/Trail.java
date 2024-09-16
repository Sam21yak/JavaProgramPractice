import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Trail {

	public static void main(String args[]){
		String str = "my name is samyak ";
		String[] words = str.split(" "); // Split the string into words
        StringBuilder reversedString = new StringBuilder();
        String rs = "";
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            System.out.println("reversed Word : "+reversedWord);
	            String rev = reversedWord.reverse().toString();
	            System.out.println("rev : "+rev);
	            Set<Character> set = new LinkedHashSet<>();
	            for(char c: rev.toCharArray())
	            {
	            	if(set.add(c)) {
	            		reversedString.append(c).toString();
	            		System.out.println("rs : "+rs);
	            	}
	            }
	        }

	        // Remove the trailing space   

	      // reversedString.deleteCharAt(reversedString.length() - 1);
	       
//	        String rs = reversedString.toString();
	        System.out.println(rs);
	        
	        
   }

}
