package ArrayProgram;

public class HighestNumberWithoutSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {23,5,11,67,8,200,76};
		int highest = arr[0];
		int secondHighest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>highest) {
				secondHighest = highest;
				highest = arr[i];
			}
			else if(arr[i]>secondHighest && arr[i] !=highest) {
				secondHighest = arr[i];
			}
		}
		System.out.println("Highest Number : "+highest);
		System.out.println("second highest Number : "+secondHighest);
	}

}
