package Practice.oops;

import javax.print.attribute.standard.PagesPerMinute;

interface  SampleInterface{
    void meth1();
    void meth2();
}
interface CHildSampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements SampleInterface,CHildSampleInterface{
    public void meth1(){
        System.out.println("i am meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
}


public class InheritanceInInterface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}


