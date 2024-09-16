import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number is : ");
        int firstNumber = sc.nextInt();
        System.out.println("second number is : ");
        int secondNumber = sc.nextInt();
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("first number is : "+firstNumber);
        System.out.println("second number is : "+secondNumber);
    }
}
