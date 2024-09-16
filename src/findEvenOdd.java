import java.util.Scanner;

public class findEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int number = sc.nextInt();
        if(number%2==0)
        {
            System.out.println("Enter number is even");
        }
        else{
            System.out.println("Enter number is odd");
        }
    }
}
