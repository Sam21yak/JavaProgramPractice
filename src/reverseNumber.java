import java.util.Scanner;



public class reverseNumber {
    public static void main(String[] args) {
        int Number = 43545;
        System.out.println("Entered is : " +Number);
        String stringOfNumber = String.valueOf(Number);
        String reverseNumber = "";
        for(int i=stringOfNumber.length()-1;i>=0;i--){
            reverseNumber = reverseNumber + stringOfNumber.charAt(i);
        }
       int FinalNumber = Integer.parseInt(reverseNumber);
        System.out.println("Reverse of Number is : " +FinalNumber);
       int num = 12345;
       int reverse = 0;
       while(num>0){
        int num2 = num%10;
        reverse = reverse*10 + num2;
        num = num/10;
       }  
       System.out.println(reverse);
        
    }
}
