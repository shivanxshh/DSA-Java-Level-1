package Practice.oops;
interface Animal {
    int a=5;
    void say();

    void bark();

    private void smell() {
        System.out.println("smelling"); // by using default and private keyword ,we can write body for methods in interface

    }

    default void eat() {
        smell();
        System.out.println("eating");  // by using default and private keyword ,we can write body for methods in interface

    }
}

class CWH implements Animal{
    //int a=45;
    public void say(){
        System.out.println("saying");
    }
    public void bark(){
        System.out.println("barking.......");
    }
}


public class DefaultMethods {
    public static void main(String[] args) {
        CWH cc= new CWH();
        cc.bark();
       // cc.smell();  //'smell()' has private access in 'Practice.oops.Animal'

        cc.eat();
        //System.out.println(cc.a);
        //System.out.println(cc.a=34); //Cannot assign a value to final variable 'a'





    }
}
