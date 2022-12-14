package DP;

import java.io.*;
import java.util.*;

public class UnboundedKnapsack {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] values = new int[n];
        for(int i=0; i<n; i++)
            values[i] = scn.nextInt();

        int[] weights = new int[n];
        for(int i=0; i<n; i++)
            weights[i] = scn.nextInt();

        int capacity = scn.nextInt();
        System.out.println(tab(values,weights,capacity));



    }
    public static int tab(int[] values, int[] weights, int capacity ){
        int n =values.length;
        int[] dp=new int[capacity+1];
        for(int cap=1;cap<=capacity;cap++){
            int max=0;
            for(int i=0;i<n;i++){
                int val=values[i];
                int wt=weights[i];
                if(wt<=cap){
                    int inc=val+dp[cap-wt];
                    max=Math.max(inc,max);
                }

            }
            dp[cap]=max;
        }
        return dp[capacity];

    }
}