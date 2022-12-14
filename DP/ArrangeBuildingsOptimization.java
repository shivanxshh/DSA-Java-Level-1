package DP;

import java.io.*;
import java.util.*;

public class ArrangeBuildingsOptimization{

    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        //int[][] dp=new int[n][2];
        //int a =rec(n-1,0,dp);
        //int b=rec(n-1,1,dp);
        //long fans=a+b;
        //fans*=fans;
        //System.out.println(fans);
        System.out.println(opt(n));



    }
    public static int rec(int n , int state,int[][] memo){
        if(n==0) return memo[n][state]=1;

        if(memo[n][state]!=0) return memo[n][state];
        int ans=0;
        if(state==1){
            ans+=rec(n-1,0,memo);
        }
        ans+=rec(n-1,1,memo);
        return memo[n][state]=ans;
    }
    public static long opt(int n){

        int lwz=1;
        int lwo=1;
        for(int i=2;i<=n;i++){
            int nlwz=lwo;
            int nlwo=lwz+lwo;
            lwz=nlwz;
            lwo=nlwo;

        }
        long fans=lwz+lwo;
        fans=fans*fans;
        return fans;
    }
}