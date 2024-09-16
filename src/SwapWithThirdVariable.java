import java.util.Scanner;

public class SwapWithThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number is : ");
        int firstNumber = sc.nextInt();
        System.out.println("second number is : ");
        int secondNumber = sc.nextInt();
        int tempNumber = firstNumber + secondNumber;
        firstNumber = tempNumber - firstNumber;
        secondNumber = tempNumber - secondNumber;
        System.out.println("first number is : "+firstNumber);
        System.out.println("second number is : "+secondNumber);
    }
}
