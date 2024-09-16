public class PyramidWithNumbers {
    public static void main(String args[])
    {
        int value = 1;
        int lines = 5;
    
        for(int row=0;row<lines;row++){
            for(int coloumn=lines-row;coloumn>1;coloumn--)
            {
                System.out.print(" ");
            }
            for(int coloumn=0;coloumn<=row;coloumn++){
                System.out.print("* ");
               // value++;
            }
            System.out.println(" ");
        }
        
    }
}
