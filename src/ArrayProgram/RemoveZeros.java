package StringPrograms;

import java.util.Scanner;

public class RemoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        scanner.close();

        int start = 0, end = number.length() - 1;

        // Find the first non-zero character from the left
        while (start < number.length() && number.charAt(start) == '0') {
            start++;
        }

        // Find the last non-zero character from the right
        while (end >= 0 && number.charAt(end) == '0') {
            end--;
        }

        if (start > end) {
            // If all characters are zeroes, return "0"
            System.out.println("0");
        } else {
            // Extract the substring without leading and trailing zeroes
            String result = number.substring(start, end + 1);

            // Check if the result starts with a decimal point
            if (result.startsWith(".")) {
                // If so, add a leading zero
                result = "0" + result;
            }

            System.out.println(result);
        }
	}

}
