package ArrayProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSameAndDiffArray {

	public static void main(String args[]) {
		int[] a = { 5, 4, 9, 8, 6, 12, 31, 67 };
		int[] b = { 5, 4, 9, 8, 7, 3, 2, 0, 1, 6, 15, 12 };
		HashMap<Integer, Integer> hm = new HashMap<>();
		List<Integer> sameElement = new ArrayList<>();
		List<Integer> duplicateElement = new ArrayList<>();
		for (int a1 : a) {
			if (hm.containsKey(a1)) {
				hm.put(a1, hm.get(a1) + 1);
			} else {
				hm.put(a1, 1);
			}
		}
		for (int b1 : b) {
			if (hm.containsKey(b1)) {
				hm.put(b1, hm.get(b1) + 1);
			} else {
				hm.put(b1, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue().equals(1)) {
				duplicateElement.add(entry.getKey());

			} else {
				sameElement.add(entry.getKey());
			}
		}
		System.out.println("Duplicate elements in arrays are : " + duplicateElement);
		System.out.println("Similar elements in arrays are : " + sameElement);
	}
}
