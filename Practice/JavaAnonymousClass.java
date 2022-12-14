package Practice;

/*ways to create an Anonymous Java class :
The Anonymous class in Java can be created by two ways :
1.By extending a class
2.By implementing an interface*/
/*@FunctionalInterface
interface Animal{
    void bark();
}

class Dog implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}

class JavaAnonymousClass{
    public static void main(String[] args) {
        Dog Bruno = new Dog();
        Bruno.bark();
    }
}*/

//------------------------------------------------------------------------------------------
/*@FunctionalInterface
interface Animal{
    void bark();
}

public class JavaAnonymousClass {
    public static void main(String[] args) {
        Animal bruno =new Animal() {  // we can give reference of interface or abstract class
            @Override
            public void bark() {
                System.out.println("dog barks");

            }
        };
        bruno.bark();

    }
}*/
//---------------------------------------------------------------

abstract class Vehicle{
    abstract void drive();
}

class AnonDemoByClass{
    public static void main(String[] args) {
        Vehicle car = new Vehicle() {
            @Override
            void drive() {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();
    }
}
