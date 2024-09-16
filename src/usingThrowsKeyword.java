public class usingThrowsKeyword {
    public static int kyeword(int a, int b) throws ArithmeticException
    {
         a = 10;
        b = 0;
        int x = a/b;
        return x;
    }
    public static void main(String[] args) {
        
        System.out.println(kyeword(10,0));
    }
}
