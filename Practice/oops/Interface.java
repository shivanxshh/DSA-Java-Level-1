package Practice.oops;
interface Bicycle {

    int a=45;  //we can also create properties in interface

    void applyBrake();

    void speedUP();    // methods of interface must be implemented
    /*void walk(){
        System.out.println("wowwww");
    */                                    //Interface abstract methods cannot have body
}

interface ByBycycle{
    void bhagao();
    void ride();
}

class AvonCycle implements Bicycle , ByBycycle{  //we can create classes with more than one interfaces
    //int a=3;
    public void bhagao(){
        System.out.println("bhagoooo");
    }
    public void ride() {
        System.out.println("Ridinggg.....");
    }
    void applyHorn(){
        System.out.println("peeeee");
    }
    public void applyBrake(){      //these methods must be public
        System.out.println("applying break");
    }

    public void speedUP(){        //these methods must be public
        System.out.println("applying speed");

    }

}

public class Interface {
    public static void main(String[] args) {
        //Bicycle bb= new Bicycle();  //'Bicycle' is abstract; cannot be instantiated
        AvonCycle aa= new AvonCycle();
        System.out.println(aa.a);
       // aa.a=34;  //Cannot assign a value to final variable 'a'
        aa.applyBrake();
        aa.bhagao();

    }
}
