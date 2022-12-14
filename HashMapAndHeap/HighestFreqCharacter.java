package HashMapAndHeap;

import java.io.*;
import java.util.*;

public class HighestFreqCharacter{

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String  s= scn.nextLine();
        System.out.println(hfc(s));

        // write your code here
    }

    public static char hfc(String s){
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }

        int freq=0;
        char ans=' ';
        for(Character key:hm.keySet()){
            if(hm.get(key)>freq){
                freq=hm.get(key);
                ans=key;
            }
        }
        return ans;

    }

}