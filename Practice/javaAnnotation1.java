package Practice;

// functional interface--An interface which contains only one abstract method is known as functional interface.
@FunctionalInterface
interface MyfuncInterface{

    void method1();
    //void method2(); //----if uncomment, this will get an error
}
class joker implements MyfuncInterface{
    public void method1(){
        System.out.println("wow");
    }
}



public class javaAnnotation1{
    public static void main(String[] args) {
       joker ee=new joker();
       ee.method1();


    }

}