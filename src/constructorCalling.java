public class constructorCalling {
    static int emp;
    {
        emp++;
    }
    constructorCalling(int x, int y){
        System.out.println(x*y +" "+emp);
     } 
    
     constructorCalling(int x) {
        this(6,5);
        System.out.println("int type argument");
     }
     constructorCalling(){
        this(5);
               System.out.println("default constructor");         
        }
    
      
      
     public static void main(String[] args) {
        new constructorCalling();
        new constructorCalling(5,8);
        System.out.println(emp);
     }  
}
