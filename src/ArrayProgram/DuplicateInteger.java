package ArrayProgram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInteger {
	public static void main(String args[]) {
		int[] arr = { 1, 2, 2, 2, 5, 6, 5, 4, 3, 7, 8, 9, 12, 31, 31, 3, 5, 4, 9, 8, 6, 12, 31, 67 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int a : arr) {
			if (hm.containsKey(a)) {
				hm.put(a, hm.get(a) + 1);
			} else {
				hm.put(a, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}
}
