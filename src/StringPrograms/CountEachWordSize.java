package StringPrograms;

public class CountEachWordSize {
	public static void main(String args[]) {
		String str = "my name is samyak";
		String[] strarray = str.split(" ");
		for(String s: strarray) {
			if(s.length()>0) {
				System.out.println(s+ " : "+s.length());
			}
		}
	}
}
