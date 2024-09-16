import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int number = sc.nextInt();
        int flag = 0;
        int halfNumber = number/2;
        for(int i=2;i<=halfNumber;i++){
            if(number%i==0){
                flag++;
                break;
            }
            else{
                continue;
            }
        }
        if(flag> 0)
        {
            System.out.println("Entered number is not a prime number");
        }
        else{
            System.out.println("Entered number is a prime number");
        }
    }
}
