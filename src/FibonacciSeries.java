import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = myObj.nextInt();
        int firstnumber = 0;
        int secondNumber = 1;
        int Fibonacci;
        System.out.print(firstnumber+" ");
        System.out.print(secondNumber+" ");
        for(int i =2;i<number;i++)
        {
            Fibonacci = firstnumber + secondNumber;
            System.out.print(Fibonacci+" ");
            firstnumber = secondNumber;
            secondNumber = Fibonacci;
           
        }
        
    }
}
