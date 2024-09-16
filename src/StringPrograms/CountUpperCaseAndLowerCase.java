package StringPrograms;

public class CountUpperCaseAndLowerCase {
	public static void main(String args[]) {
		String str = "My @ Name I10s S*&amyak Jain";
		int capital = 0;
		int small = 0;
		int digits = 0;
		int special = 0;
		for(int i=0;i<str.length();i++) {
			//char ch = str.charAt(i);
			if(str.charAt(i)>= 'A' && str.charAt(i) <= 'Z')
			{
				capital++;
			}
			else if(str.charAt(i)>= 'a' && str.charAt(i) <= 'z') {
				small++;
			}
			else if(str.charAt(i)>= '0' && str.charAt(i) <= '9') {
				digits++;
			}
			else {
				special++;
			}
		}
		System.out.println("Total UpperCase letters are : "+capital);
		System.out.println("Total lower case letter are : "+small);
		System.out.println("total digits are : "+digits);
		System.out.println("Total spaces and special characters are : "+special);
	}
}
