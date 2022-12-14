package Practice.SamplePackage1;

import Practice.AccessModifier;
import Practice.demoAccessModifier;
//import Practice.c1;

public class sampleclass1 {
    public static void main(String[] args) {
        AccessModifier obj2 = new AccessModifier();
        //obj2.printz();
        System.out.println(obj2.a); // we can only use private Access modifier properties when we are in another package
        //System.out.println(obj2.b);  //'b' has protected access in 'Practice.AccessModifier'
        //System.out.println(obj2.c); //'c' is not public in 'Practice.AccessModifier'. Cannot be accessed from outside package
        //System.out.println(obj2.d);
       /* demoAccessModifier obj3=new demoAccessModifier();
        obj3.printkro();*/
    }
}
