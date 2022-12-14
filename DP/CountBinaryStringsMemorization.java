package DP;

import java.io.*;
import java.util.*;

public class CountBinaryStringsMemorization{

    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int[][] dp=new int[n+1][2];
        int a =rec(n-1,0,dp);
        int b=rec(n-1,1,dp);
        System.out.println(a+b);



    }
    public static int rec(int n , int state,int[][] memo){
        if(n==0) return memo[n][state]=1;
        int ans=0;
        if(memo[n][state]!=0) return memo[n][state];
        if(state==1){
            ans+=rec(n-1,0,memo);
        }
        ans+=rec(n-1,1,memo);
        return memo[n][state]=ans;
    }
}