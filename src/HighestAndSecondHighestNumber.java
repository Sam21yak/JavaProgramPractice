import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HighestAndSecondHighestNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers want to compare : ");
        int arraysize = sc.nextInt();
       
        int[] arr = new int[arraysize];

        for(int i=0;i<arraysize;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array is : "+arr);
        System.out.println("largest number is : "+arr[arraysize-1]);
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[arr.length-1] != arr[i])
            {
                System.out.println("second largest number is : " +arr[i]);
                break;
            }
        }
    }
 
}
