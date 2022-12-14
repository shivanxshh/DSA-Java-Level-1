package Practice.Thread;
 // void sum(int a , int b){ -------------------> parameters
// }

// sunm(3,4) --------> arguments are actual values

class thread1 extends Thread{
 @Override
 public void run(){
  int i=0 ;
  while(i<45){
   System.out.println("i am bathing");
   System.out.println("i am dancing");
   i++;


  }


 }

}
public class Threadingintro {
 public static void main(String[] args) {
  thread1 ss= new thread1();
  thread1 dd= new thread1();
  ss.start();


 }
}
