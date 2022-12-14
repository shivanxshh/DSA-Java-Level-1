package DP;

import java.io.*;
import java.util.*;

public class CountBinaryStringsRecursiom{

    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int a =rec(n-1,0);
        int b=rec(n-1,1);
        System.out.println(a+b);



    }
    public static int rec(int n , int state){
        if(n==0) return 1;
        int ans=0;
        if(state==1){
            ans+=rec(n-1,0);
        }
        ans+=rec(n-1,1);
        return ans;
    }
}