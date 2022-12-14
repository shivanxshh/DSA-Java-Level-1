package DP;


import java.io.*;
import java.util.*;

public class TargettSumSubsetsDP {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int coins[]=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=scn.nextInt();
        }
        int tar=scn.nextInt();
        System.out.println(tarSum_tab(coins,tar,n));


    }
    public static boolean tarSum_tab(int coins[],int tar,int n){

        boolean mem[][]=new boolean[n+1][tar+1];

        for(int r=0;r<=n;r++){
            for(int c=0;c<=tar;c++){
                if(r==0 && c==0){
                    mem[r][c]=true;
                }
                else if(r==0){
                    mem[r][c]=false;
                }

                else if(c==0){
                    mem[r][c]=true;
                }
                else{
                    boolean res=mem[r-1][c];//exclude
                    int coin=coins[r-1];
                    if(coin<=c){
                        res=res || mem[r-1][c-coin];
                    }
                    mem[r][c]=res;

                }

            }
            if(mem[r][tar]) return true;
        }
        return false;
    }
}