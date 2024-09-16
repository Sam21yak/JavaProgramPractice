package ArrayProgram;

public class missingSmallestNumber {
	public static void main(String args[]) {
		int[] arr = { 1, 3, 5, 4, 9, 8, 6, 12, 31, 67 };
		int msn = missingSmallestNumber(arr, arr.length);
		System.out.println(msn);

	}

	public static int missingSmallestNumber(int[] a, int length) {
		int i;
		for (i = 1; i <= a.length + 1; i++) {
			boolean missingflag = true;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i) {
					missingflag = false;
					break;
				}
			}
			if (missingflag) {
				return i;
			}
		}
		return i;
	}
}
