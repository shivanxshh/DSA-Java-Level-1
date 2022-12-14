package Practice;
class c1{
    public int a=2;
    protected int b=3;
    int c=4;
    private int d=5;

    /*void printnum(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }*/
}

class c2 extends c1{
    void printkrugaab() {
        System.out.println(a);
        System.out.println(b);  // there is a doubt as per the java doc we can only access private and protected but here its also able to access default
        System.out.println(c);
        //System.out.println(d);
    }




}

public class AccessModifier {
    public int a=2;
    protected int b=3;
    int c=4;
    private int d=5;
    public void printz(){
        int z=99;
        System.out.println(z);

    }
    public static void main(String[] args) {

        //c1 gg=new c1();

        //gg.printnum();
        /*System.out.println(gg.a);
        System.out.println(gg.b);
        System.out.println(gg.c);*/
        //System.out.println(gg.d); d has private access  so, won't run
        c2 cc= new c2();
        cc.printkrugaab();
       /* System.out.println(cc.a);
        System.out.println(cc.b);
        System.out.println(cc.c);
        System.out.println(gg.d);*/




    }
}
