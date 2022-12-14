package Practice.oops;
 abstract class Parent2{
     int a=5;//properties can also be defined in abstract class

    public Parent2(){
        System.out.println("constructor of parent2");
    } //default constructor will run automatically
    public void sayHello(){
        System.out.println("hello");
    }

     abstract public void wow();
    abstract public void greet();  //we can not specify abstract method in non abstract class
                                   // in abstract class we can define methods with or without its body


}

abstract class Parent3{
    int a=5;//properties can also be defined in abstract class

    public Parent3(){
        System.out.println("constructor of parent2");
    } //default constructor will run automatically
    public void sayHello(){
        System.out.println("hello");
    }

    abstract public void wow();
    abstract public void greet();  //we can not specify abstract method in non abstract class
    // in abstract class we can define methods with or without its body


}
class child2 extends Parent2{ // we can not extend a class from more than 1 abstract classes
    public void wow(){

        System.out.println("hello");
    }

     public void greet(){
         System.out.println("ni hao");
    }  //abstract methods ki body likhni hi pdegi
}

  class child3 extends child2{
    public void greet(){
        System.out.println("talking....."+a);
    }
     /*public void wow(){
         System.out.println("walking.....");
     }*/



 }
public class Abstract {
    public static void main(String[] args) {
        //Parent2 ss=new Parent2();  //abstract class can not instantiated
        //child2 ss= new child2();
        //ss.greet();
        child3 dd=new child3();
        dd.a=7;
        dd.greet();
        dd.wow();
       // Parent2 pp=new Parent2();






    }
}
