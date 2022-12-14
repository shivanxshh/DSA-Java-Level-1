package DP;

import java.io.*;
import java.util.*;

public class ClimbStairsWithVariableJumps{

    public static void main(String[] args) throws Exception {
        // write your code her
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++) arr[i]=scn.nextInt();
        System.out.println(tab(n,arr));


    }
    public static int tab(int n,int[] arr){
        int[] dp=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            int v=arr[i];
            for(int jump=1;jump<=v && jump+i<=n;jump++){
                dp[i]+=dp[i+jump];
            }
        }
        return dp[0];
    }

}