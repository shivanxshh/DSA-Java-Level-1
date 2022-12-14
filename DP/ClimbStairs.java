package DP;

import java.io.*;
import java.util.*;

public class ClimbStairs {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();

        int ans=climbStairs(n,new int[n+1]);
        System.out.println(ans);

        // write your code here
    }
    public static int climbStairs(int n,int[] mem){
        if(n==0){
            return mem[n]=1;

        }
        if(mem[n]!=0){
            return mem[n];
        }
        int ans=0;
        if(n>=1){
            ans+=climbStairs(n-1,mem);
        }
        if(n>=2){
            ans+=climbStairs(n-2,mem);
        }
        if(n>=3){
            ans+=climbStairs(n-3,mem);
        }

        return mem[n]=ans;



    }

}