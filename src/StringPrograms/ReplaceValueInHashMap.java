package StringPrograms;

import java.util.HashMap;

public class ReplaceValueInHashMap {
	public static void main(String args[]) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("ONE", "AAA");
		hm.put("TWO", "BBB");
		hm.put("THREE", "CCC");
		hm.put("FOUR", "DDD");
		hm.put("FIVE", "EEE");
		System.out.println("Before replace : " + hm);
		hm.replace("TWO", "222");
		hm.remove("FOUR");
		hm.replace("FIVE", "EEE", "%%%");
		System.out.println("After replace : " + hm);
	}
}
