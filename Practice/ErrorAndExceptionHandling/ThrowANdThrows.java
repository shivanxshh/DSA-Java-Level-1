package Practice.ErrorAndExceptionHandling;

import Practice.Thread.Extendthread;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative! ";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative! kya yaar tum b";
    }
}

public class ThrowANdThrows {
    public static double area(int r) throws NegativeRadiusException {  // result cant be negative
        if (r < 0) {
            throw new NegativeRadiusException();

        }
        double res = Math.PI * r * r;
        return res;
    }

    //code by shivansh
    public static void divide(int a, int b) throws Exception{
        int c=a/b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        //code by golu
        try {
           double  res=area(-2);
            System.out.println(res);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        /*try{
            divide(3,0);
        }
        catch(Exception e){
            System.out.println(e);
        }*/


    }
}
