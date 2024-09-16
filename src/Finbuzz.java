public class Finbuzz {
    public static void main(String[] args){
        int n = 12;
        for(int i = 1; i<=n;i++)
        {
            if(i%3==0 && i%5!=0)
            {
                System.out.println("Finn");
            }
            else if(i%5==0 && i%3!=0)
            {
                System.out.println("Buzz");
            }
            else if(i%3==0 && i%5==0)
            {
                System.out.println("Finn Buzz");
            }
            else{
                System.out.print("not multiple of 3 & 5  = ");
                System.out.println(i);
            }
        }
    }
}
