package DP;

import java.io.*;
import java.util.*;

public class CoinChangeCombination {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);         //recursion
        int n =scn.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++) coins[i]=scn.nextInt();
        int tar=scn.nextInt();

        int ans=coinChange_rec(coins,0,0,tar);
        System.out.println(ans);
    }


    public static int coinChange_rec(int coins[],int idx,int ssf,int tar){
        if(idx==coins.length){
            if(ssf==tar){
                return 1;
            }
            return 0;
        }
        int coin=coins[idx];
        int ways=0;
        for(int i=1;ssf+(coin*i)<=tar;i++){
            ways+=coinChange_rec(coins,idx+1,ssf+(coin*i),tar);
        }
        ways+=coinChange_rec(coins,idx+1,ssf,tar);
        return ways;
    }
}