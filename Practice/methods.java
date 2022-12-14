package Practice;

public class methods {
    static void telljoke(){
        System.out.println("shivansh");
    }

    static int logic(int a,int b){  //we can use methods without using static keyword,only if we first create a object of the main class(which consist of the method)
        int c=a+b;
        return c;

    }
    public static void main(String[] args) {
        int x=logic(3,2);
        telljoke();
        //methods ss=new methods();
        //int x=ss.logic(3,2);
        System.out.println(x);

    }
}
