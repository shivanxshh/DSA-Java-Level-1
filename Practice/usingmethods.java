package Practice;

public class usingmethods {
    static void change(int a){
        a=23;
    }

    static void change2(int [] arr){
        arr[0]=22;
    }

    public static void main(String[] args) {
        //int x=99;
       // change(x);// value has not been changed( Because a copy of value is made)hence,the value of original variable(a) is not changed.
        //System.out.println(x);
        int [] arr1={10,20,30,40};
        change2(arr1);  //value will be changed for arr[0] because here the reference will be passed instead of making a new copy of variable
        System.out.println(arr1[0]);//hence the changes will be done at original place
    }
}
