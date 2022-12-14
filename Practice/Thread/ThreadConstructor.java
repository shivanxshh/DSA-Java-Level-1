package Practice.Thread;
class Mythr extends Thread{
    Mythr(String name){
        super(name);
    }

    public void run(){
        System.out.println("Yo yo honey singh");
    }

}
public class ThreadConstructor {
    public static void main(String[] args) {
        Mythr nn= new Mythr("Shivansh");
        Mythr fifi= new Mythr("Bhardwaj");

        nn.start();
        fifi.start();

        System.out.println("The id of the thread is "+nn.getId());
        System.out.println("The name of the thread is "+nn.getName());

        System.out.println("The id of the thread is "+fifi.getId());
        System.out.println("The name of the thread is "+fifi.getName());


    }
}
