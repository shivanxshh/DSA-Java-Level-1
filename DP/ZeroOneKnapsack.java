package DP;

import java.io.*;
import java.util.*;

public class ZeroOneKnapsack {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int vis[]=new int[n];  //recursion
        for(int i=0;i<n;i++){
            vis[i]=scn.nextInt();


        }
        int wts[]=new int[n];
        for(int i=0;i<n;i++){
            wts[i]=scn.nextInt();


        }
        int cap=scn.nextInt();

        int x=maxValue(wts,vis,cap,0);
        System.out.println(x);



    }
    public static int maxValue(int wts[],int vis[],int cap,int idx){
        if(idx==vis.length){
            return 0;
        }
        int wt=wts[idx], vl=vis[idx];
        int ans=Integer.MIN_VALUE;
        if(wt<=cap){//include
            ans=Math.max(ans,maxValue(wts,vis,cap-wt,idx+1)+vl);
        }

        //exclude
        ans=Math.max(ans,maxValue(wts,vis,cap,idx+1));
        return ans;
    }
}
