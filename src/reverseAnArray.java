


public class reverseAnArray {
    public static void main(String[] args) {
        char[] arr = {'S', 'A', 'M','Y','A','K'};
     
        System.out.println(arr);
        String str = new String(arr);
        String reverse = " ";
       
        System.out.println("Array for reverse is : "+str);
        int size = arr.length;
        System.out.println("size : "+size);
        for(int i=size-1;i>=0;i--){
          
           reverse = reverse + str.charAt(i);
         
        }
        System.out.println("reversed array : "+reverse);
        String str2 = "Samyak";
        StringBuilder reverse2 = new StringBuilder(str2);
        System.out.println(reverse2.reverse());



    }
}