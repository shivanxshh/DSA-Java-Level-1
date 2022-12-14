package Practice.oops;
//Dynamic mehthod dispatch or Runtime polymorphism
class Phone{
    public void greet(){
        System.out.println("Hy i'm groot");
    }
    public void name(){
        System.out.println("My name is java");
    }
}
class SmartPhone extends Phone{
    public void click(){
        System.out.println("Captured your pic");
    }
    @Override
    public void name(){
        System.out.println("The name is java in class 2");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone ss=new SmartPhone();  //phone k reference s hmne smartphone ka object bana dia
        //SmartPhone dd=new Phone(); //Not allowed

        //ss.click();
        ss.greet();
        ss.name();// override method will be run
        

    }


}

