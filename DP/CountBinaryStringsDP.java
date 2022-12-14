package DP;
import java.io.*;
import java.util.*;

public class CountBinaryStringsDP{

    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();

        int mem[][]=new int[2][n+1];
        for(int i=0;i<=n;i++){
            if(i==0 || i==1){
                mem[0][i]=mem[1][i]=1;
            }
            else{
                mem[0][i]=mem[1][i-1];
                mem[1][i]=mem[0][i-1]+mem[1][i-1];

            }

        }
        int ans=mem[0][n]+mem[1][n];
        System.out.println(ans);
        // write your code here
    }

}