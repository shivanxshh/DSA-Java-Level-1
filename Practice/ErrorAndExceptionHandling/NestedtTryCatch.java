package Practice.ErrorAndExceptionHandling;

import java.util.Scanner;

public class NestedtTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index");
            try {
                int ind = sc.nextInt();
                try {
                    System.out.println("Welcome to video no 82");
                    try {
                        System.out.println(marks[ind]);
                        flag = false;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Sorry this index does not exist");
                        System.out.println("Exception in level 2");
                    }
                } catch (Exception e) {
                    System.out.println("Exception in level 1");
                }
            } catch (Exception e) {
                flag=false;
                System.out.println(e);
            }
            System.out.println("Thanks for using this program");
        }
    }
}
