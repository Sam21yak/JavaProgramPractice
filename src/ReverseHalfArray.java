public class ReverseHalfArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,6,56,44,100,100,56,11,12};
        int len=arr1.length;
        System.out.println(len);
        for(int i=0; i<len/4;i++)
        {
            int t = arr1[i];
    
            arr1[i] = arr1[len/2 - i - 1];
    
            arr1[len/2 - i - 1] = t;
    
        }
        for(int j=0; j<len; j++)
        {
           System.out.print(arr1[j]+" ");
        }
       }
}
