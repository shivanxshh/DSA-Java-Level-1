package Sorting;

import java.io.*;
import java.util.*;

public class MergeTwoSortedArrays {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int[] res= new int[a.length+b.length];
        int p1=0,p2=0,idx=0;

        while(idx<res.length){
            int v1=(p1<a.length) ? a[p1] : Integer.MAX_VALUE;
            int v2=(p2<b.length) ? b[p2] : Integer.MAX_VALUE;

            if(v1<v2){
                res[idx]=v1;
                idx++;
                p1++;

            }
            else{
                res[idx]=v2;
                idx++;
                p2++;


            }
        }

        return res;
    }

    public static void print(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for(int i = 0 ; i < m; i++){
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a,b);
        print(mergedArray);
    }

}