public class UseThrowKeyword {
    static void checkAge(int Age)
    {
        if(Age<18){
            throw new ArithmeticException("You are minor");
        }
        else if(Age >60){
            throw new ArithmeticException("You are older");
        }
        else{
            System.out.println("Access granted");
        }

    }
    public static void main(String[] args) {
        checkAge(14);
    }

}
