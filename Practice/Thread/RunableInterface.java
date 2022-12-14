package Practice.Thread;

//2.)By implementing Runnable interface

class MyNewthread implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("bhardwajysdiujgsknsdgfhdshgkjdfh");
            i++;
        }
    }
}

class MyNewthread2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("Shivansh");
            i++;
        }
    }
}


public class RunableInterface {
    public static void main(String[] args) {
        MyNewthread bullet= new MyNewthread();
        Thread gun= new Thread(bullet);
        MyNewthread2 bullet2= new MyNewthread2();
        Thread gun2= new Thread(bullet2);

        gun.start();
        gun2.start();




    }
}
