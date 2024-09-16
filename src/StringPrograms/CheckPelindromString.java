package StringPrograms;

public class CheckPelindromString {
	public static void main(String args[]) {
		//String str1 = "iTopiNonAvevanoNipoti";
		String str1 = "iTopiNonAvevanoNi34poti";
		String str = str1.toLowerCase();
		int length = str.length();
		boolean flag = true;
		for(int i=0;i<length/2;i++) {
			if(str.charAt(i)!=str.charAt(length-1-i)) {
				flag = false;
				System.out.println("Given String is not Pelindrome");
				break;
			}
			}
		if(flag) {
			System.out.println("Given String is Pelindrome");
		}
		}
}
