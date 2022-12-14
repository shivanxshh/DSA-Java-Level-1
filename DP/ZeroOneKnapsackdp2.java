import java.io.*;
import java.util.*;

public class ZeroOneKnapsackdp2 {

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
    public static int tab(int[] values, int[] weights, int capacity){
        int n =values.length;
        int dp[][]=new int[n+1][capacity+1];

        for(int i=1;i<=n;i++){
            for(int cap=1;cap<=capacity;cap++){
                int val=values[i-1];
                int wt=weights[i-1];

                if(wt<=cap){
                    int inc=dp[i-1][cap-wt]+val;
                    int exc=dp[i][cap]=dp[i-1][cap];
                    dp[i][cap]=Math.max(inc,exc);


                }
                else{
                    dp[i][cap]=dp[i-1][cap];
                }
            }
        }
        return dp[n][capacity];
    }
}