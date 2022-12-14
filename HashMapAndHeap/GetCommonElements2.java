package HashMapAndHeap;

import java.io.*;

import java.util.*;

public class GetCommonElements2 {

    public static void main(String[] args) throws Exception {
        //Write your code here
        Scanner scn=new Scanner(System.in);
        int n1= scn.nextInt();
        int[] a1=new int[n1];
        for(int i=0;i<a1.length;i++){
            a1[i]=scn.nextInt();

        }
        int n2= scn.nextInt();
        int[] a2=new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i]=scn.nextInt();

        }
        HashMap<Integer,Integer> fmap=new HashMap<>();
        for(int val:a1){
            if(fmap.containsKey(val)){
                fmap.put(val,fmap.get(val)+1);
            }
            else{
                fmap.put(val,1);
            }

        }

        for(int val:a2){
            if(fmap.containsKey(val) && fmap.get(val)>0){
                System.out.println(val);
                fmap.put(val,fmap.get(val)-1);

            }
        }

    }

}
