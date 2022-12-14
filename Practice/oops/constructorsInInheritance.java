package Practice.oops;
class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int a){
        System.out.println("I am a overloaded constructor:"+a);

    }
    base1(int a , int b , int c){
        System.out.println("I am a overloaded constructor:"+a+b+c);

    }
}
class Derived1 extends base1{
    Derived1(){
        //super(5);
        //super(3,3,3);  //super helps in calling parent constructor and methods
        System.out.println("I am a derived class constructor");
    }
    Derived1(int a , int b){
        super(4,5,6);
        System.out.println("I am a derived class constructor:"+a+b);

    }


}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("i am a child of derived constructor");
    }
    childOfDerived(int a ){
        super(9,9);
        System.out.println("i am an overload constructor:" +a);
    }

}

public class constructorsInInheritance {
    public static void main(String[] args) {
        //base1 ss= new base1(99);
       // Derived1 dd= new Derived1();
        //Derived1 dd= new Derived1(10,11);
        //childOfDerived sd= new childOfDerived(10);
        childOfDerived fd= new childOfDerived();


    }



}
