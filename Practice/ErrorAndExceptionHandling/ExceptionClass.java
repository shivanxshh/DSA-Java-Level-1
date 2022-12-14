package Practice.ErrorAndExceptionHandling;

import java.util.Scanner;

class MyNewException extends Exception{
    @Override
    public String toString() {
        return "i am toString";
    }

    @Override
    public String getMessage() {
        return "i am a getMessage";
    }
}
class AgeException extends Exception{
    @Override
    public String toString() {
        return "Age can not be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure to fill the right age";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter an age");
        int age =scn.nextInt();
        if(age>125){
            try{
                //throw new AgeException();  // we can throw both user defined or built in exception
                throw new ArithmeticException("This is an arithmetic erorr");
            }
            catch(Exception e){
                //System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("finished");

            }
            System.out.println("definately finished");
        }
        else{
            System.out.println("do again");
        }

    }
}
