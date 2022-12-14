package Practice.ErrorAndExceptionHandling;
// Runtime errors are also called exceptions
/* Commonly Occurring Exceptions
         1) Checked exceptions - compile-time exceptions (Handle by the compiler)
        2) Unchecked exceptions - Runtime exceptions

*/

public class TryAndCatch {
    public static void main(String[] args) {
        int x=2000;
        int y=0;

        int c=x/y;
        System.out.println(c);
//       try{
//           int c=x/y;
//           System.out.println(c);
//       }
//       catch(Exception e){
//           System.out.println("i am getting an exception");
//           System.out.println(e);
//
//        }
       System.out.println("end of program"); // will not work if exception is not handled .
//
    }
}
