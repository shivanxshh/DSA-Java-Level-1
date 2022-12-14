package DP;

import java.io.*;
import java.util.*;

public class goldmine {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[][] arr= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println(tab(n,m,arr));
        // write your code here
    }
    public static int tab(int n,int m,int[][] arr){
        int[][] dp=new int[n][m];

        for(int j=m-1;j>=0;j--){
            for(int i=0;i<n;i++){
                if(j==m-1){
                    dp[i][j]=arr[i][j];
                }
                else if(i==0){
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j+1])+arr[i][j];
                }
                else if(i==n-1){
                    dp[i][j]=Math.max(dp[i][j+1],dp[i-1][j+1])+arr[i][j];
                }
                else{
                    int cm=Math.max(dp[i][j+1],dp[i+1][j+1]);
                    cm=Math.max(cm,dp[i-1][j+1]);
                    dp[i][j]=cm+arr[i][j];

                }
            }

        }
        int fans=0;
        for(int i=0;i<n;i++){
            fans=Math.max(fans,dp[i][0]);

        }
        return fans;

    }

}
