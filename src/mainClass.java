public class mainClass {
        public static void main(String[] args) 
        {
           B b = new B();
           System.out.println(b.x);
         
           A a = new A();
           System.out.println(a.x);
         
           A a2 = new B();
           System.out.println(a2.x);

           //B b2 = new A();
          }
        }

