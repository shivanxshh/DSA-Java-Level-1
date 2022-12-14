package Practice;

import java.util.regex.*;

public class regesss{

    public static void main(String[] args) {
/*
        String str = "HelloWorld-.J34ava";

        // or ^[\\w]+$
        if (str.matches("^[a-zA-Z0-9_.-]+$")) {
            System.out.println("Yes, true.");
        } else {
            System.out.println("failed!");
        }*/

        boolean b3 = Pattern.matches("^[a-zA-Z0-9_.-]+$\"", "shiv12.-_");
        System.out.println(b3);

    }
}
