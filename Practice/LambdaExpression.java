package Practice;
interface LambExp{
    void shot(int a,int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        LambExp obj=(a,b)->{
            System.out.println("the value of a is:"+a+" and the value of b is:"+b);
        };
        obj.shot(3,4);
    }
}
