public class displayFloysTriangle {
    public static void main(String[] args) {
        int lines = 5;
        int printValue = 1;
    
            for(int row=1;row<=lines;row++)
            {
                for(int coloumn=1;coloumn<=row;coloumn++){
                    System.out.print(printValue+" ");
                    printValue++;
                }
                System.out.println(" ");
            }
    
        }
}
