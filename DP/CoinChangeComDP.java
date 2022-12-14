import java.util.*;

public class CoinChangeComDP{

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++) coins[i]=scn.nextInt();
        int tar=scn.nextInt();

        int[] dp=new int[tar+1];
        dp[0]=1;

        for(int coin:coins){
            for(int amt=0;amt<=tar;amt++){
                if(amt>=coin){dp[amt]+=dp[amt-coin];}



            }
        }
        System.out.println(dp[tar]);








    }
}