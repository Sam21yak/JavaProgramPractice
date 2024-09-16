package StringPrograms;

public class FirstLetterCapital {
	public static void main(String args[]) {
		String str = "my name is samyak jain";
		System.out.println("Orignal String : " + str);
		String[] strarray = str.split(" ");
		String capitalize = "";
		for (String s : strarray) {
			String firstLetter = s.substring(0, 1);
			String remainingLetter = s.substring(1);
			capitalize = capitalize + firstLetter.toUpperCase() + remainingLetter + " ";
		}
		System.out.println(capitalize);
	}
}
