package Practice.oops;

class base{ //parent class // super class
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("i am a method");

    }
}
class Derived extends base{ //child // subclass
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        //base ss= new base();
        //ss.setX(5);
       // System.out.println(ss.getX());
       // ss.printMe();

        Derived dd= new Derived();
        dd.setX(74);
        dd.setY(44);
        dd.printMe();
        System.out.println(dd.getX());
        System.out.println(dd.getY());


    }

}
