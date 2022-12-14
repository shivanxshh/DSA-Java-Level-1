package Practice.oops;
class A{
    A(){ //Called as default
        System.out.println("yesssss");

    }


    public int printNow(){
        return 4;

    }
    public void method2(){
        System.out.println("I am method 2 ");
    }
}
class B extends A {

    B(int a) {
        System.out.println("no. is " + a);

    }
    @Override
    public void method2(){
        System.out.println("i am method 2 of class B");

    }
}

public class MethodOverriding {



    public static void main(String[] args) {
        B ss= new B(1);
        ss.method2();
    }





}
