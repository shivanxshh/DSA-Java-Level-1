package Practice.Thread;

//2 ways of creating thread
//1.)By Extending Thread Class
//2.)By implementing Runnable interface

    //1.By Extending Thread Class
class thread2 extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i < 40000) {
                System.out.println("Shivansh");
                i++;
            }
        }
    }

    class thread3 extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i < 40000) {
                System.out.println("Bhardwajbgdsfkjdshjkfn");
                i++;


            }
        }
    }
    public class Extendthread{
        public static void main(String[] args) {
            Practice.Thread.thread2 tt=new Practice.Thread.thread2();
            Practice.Thread.thread3 ft= new Practice.Thread.thread3();
            tt.start();
            ft.start();
        }
    }




