import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first word : ");
        String firstWord = myObj.nextLine();
        System.out.println("Enter second word : ");
        String secondWord = myObj.nextLine();
        char[] arrS1 = firstWord.toLowerCase().toCharArray();
        Arrays.sort(arrS1);
        char[] arrS2 = secondWord.toLowerCase().toCharArray();
        Arrays.sort(arrS2);
        if(firstWord.length() == secondWord.length()){
            if(Arrays.equals(arrS1, arrS2)){
                System.out.println("Word "+firstWord+" & "+secondWord+" is anagram");
            }
            else{
                System.out.println("Word "+firstWord+" & "+secondWord+" is not anagram");
            }   
        }
        else{
            System.out.println("Word "+firstWord+" & "+secondWord+" do not have same length hence these are not anagram");
        }

    }
}
