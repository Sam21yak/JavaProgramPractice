public class PrintNumberOfObject {
    static int count = 0;
    {
        count++;
    }

    PrintNumberOfObject(){
       this(13.7); 
    //    count++;
    }

    PrintNumberOfObject(int i){
        //count++;
    }
    PrintNumberOfObject(double d){
        //count++;
    }
public static void main(String[] args) {
    PrintNumberOfObject T1 = new PrintNumberOfObject();
    PrintNumberOfObject T2 = new PrintNumberOfObject(10);
    PrintNumberOfObject T3 = new PrintNumberOfObject (20.5);
    System.out.println(count);
}


}
