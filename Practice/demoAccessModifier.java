package Practice;

public class demoAccessModifier {
    public void printkro(){
        int de=45;
        System.out.println(de);
    }
    public static void main(String[] args) {
        AccessModifier am= new AccessModifier();
        System.out.println(am.a);// we can use all access modifier other than private when we are in same package
        System.out.println(am.b);  // we can use all access modifier other than private when we are in same package
        System.out.println(am.c);// we can use all access modifier other than private when we are in same package
        //System.out.println(am.d); //'d' has private access in 'Practice.AccessModifier'
       // am.printz();
        /*c1 obj=new c1();
        System.out.println(obj.a);// will get output
        System.out.println(obj.b);// will get output
        System.out.println(obj.c); // will get output*/
        //System.out.println(obj.d); //d has private access  so, won't run

    }

}
