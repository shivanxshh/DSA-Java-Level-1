package Practice.ErrorAndExceptionHandling;

import java.util.Scanner;

public class HandlingSepcificExceptions {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=2;
        marks[1]=6;
        marks[2]=3;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = scn.nextInt();
        System.out.println("Enter the no. you want to divide with");
        int c = scn.nextInt();
        try{
            System.out.println("Print the value with the given index  "+ marks[ind]);
            System.out.println("Answer after division the ele of arrays with the given no.  "+ marks[ind]/c);
        }
        catch(ArithmeticException e){
            System.out.println("this error is for arithmetic "+ e);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("the error is for indexoutofbound "+e);
        }
        catch(Exception e){
            System.out.println("otherwise");
            System.out.println(e);
        }

    }




}
