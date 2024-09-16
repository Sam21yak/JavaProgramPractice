import java.util.Scanner;

public class PalondromeNumber {
    public static void main(String[] args) {
        int Number = 345323;
        int Number2= 254452, temp,sum=0;
        System.out.println(Number2);
        String num = String.valueOf(Number);
        int size = num.length()-1;
        String reverseNumber = "";
       
        for(int i = size;i>=0;i--)
        {
            reverseNumber = reverseNumber + num.charAt(i);
        }
        if(reverseNumber.equals(num)){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
        temp = Number2;
        while(Number2>0){
            int r = Number2%10;
            System.out.println("r : "+r);
            sum = (sum*10)+r;
            System.out.println("sum : "+sum);
            Number2 = Number2/10;
            System.out.println("Number2 : "+Number2);
        }
        if(temp==sum){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }

    
}
