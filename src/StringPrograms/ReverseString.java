package StringPrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		String str = "my Name is Samyak";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'Whole String' : To reverse whole String");
		System.out.println("Enter 'Each Word' : To reverse each word of String");
		System.out.print("Please Enter the number : ");
		String pressValue = sc.nextLine();
		StringBuilder reverseString = new StringBuilder();
		if (pressValue.equalsIgnoreCase("Whole String")) {
			StringBuilder reverseWholeString = new StringBuilder(str);
			reverseWholeString.reverse().toString();
			System.out.println(reverseWholeString);
		} else if (pressValue.equalsIgnoreCase("Each Word")) {
			String[] strarray = str.split(" ");
			for (String s : strarray) {

				StringBuilder reverseWord = new StringBuilder(s);
				StringBuilder rw = new StringBuilder();
				reverseString = reverseString.append(reverseWord.reverse()).append(" ");
			}
			System.out.println(reverseString.toString());
		}

	}
}
