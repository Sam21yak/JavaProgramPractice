public class SequenceOfExecution {

    SequenceOfExecution(){
       
        System.out.println("Constructor");    
    }
    static{
    System.out.println("Static block");
    }
    {
        System.out.println("Instance block");
    } 
    public static void main(String[] args) {
        System.out.println("Main Method");
        SequenceOfExecution T1 = new SequenceOfExecution();
        T1.m1();
        System.out.println("Main class"); 
       // m1();
    }  
    public void m1(){
        System.out.println("normal Method");
    }     
  
}
