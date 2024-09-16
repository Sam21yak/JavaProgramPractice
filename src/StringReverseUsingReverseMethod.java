import java.util.Scanner;

public class StringReverseUsingReverseMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for reverse : ");
        String str = sc.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("String after reverse : "+reverse);
    }
    
}
