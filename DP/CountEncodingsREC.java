package DP;

import java.io.*;
import java.util.*;

public class CountEncodingsREC {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String ss=scn.nextLine();
        System.out.println(countEnco(ss,0));

    }
    public static int countEnco(String str,int idx){
        if(idx==str.length()){
            return 1;
        }
        char fch=str.charAt(idx);
        if(fch=='0') return 0;
        int ans=countEnco(str,idx+1);

        if(idx+1<str.length()){
            char sch=str.charAt(idx+1);
            int num=Integer.parseInt(""+fch+sch);
            if(num>=1 && num<=26){
                ans+=countEnco(str,idx+2);
            }
        }
        return ans;
    }
}
