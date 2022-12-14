package DP;

import java.io.*;
import java.util.*;

public class CountEncodingsMemorization {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String ss=scn.nextLine();
        int mem[]=new int[ss.length()+1];
        Arrays.fill(mem,-1);
        System.out.println(countEnco(ss,0,mem));

    }
    public static int countEnco(String str,int idx,int mem[]){
        if(idx==str.length()){
            return mem[idx]= 1;
        }
        char fch=str.charAt(idx);
        if(fch=='0') return mem[idx]=0;
        int ans=countEnco(str,idx+1,mem);

        if(idx+1<str.length()){
            char sch=str.charAt(idx+1);
            int num=Integer.parseInt(""+fch+sch);
            if(num>=1 && num<=26){
                ans+=countEnco(str,idx+2,mem);
            }
        }
        return mem[idx]=ans;
    }
}