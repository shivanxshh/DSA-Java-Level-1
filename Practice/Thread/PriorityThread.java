package Practice.Thread;
class Thread4 extends Thread{
    Thread4(String name){

        super(name);

    }

    public void run(){

        System.out.println("I am thread :"+Thread.currentThread().getName());
        System.out.println("I am thread :"+ Thread.currentThread().getPriority());
    }
}

public class PriorityThread {
    public static void main(String[] args) {
        Thread4 bb= new Thread4("Shivansh");
        Thread4 gg= new Thread4("Bhardwaj");

        bb.setPriority(Thread.MAX_PRIORITY);
        gg.setPriority((Thread.MIN_PRIORITY));
        bb.start();
        gg.start();


    }
}
