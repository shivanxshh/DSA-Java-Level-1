import java.io.*;
import java.util.*;
public class Balanced_Brackets {
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        System.out.println(bal(s));

    }
    public static boolean bal(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else if(ch==')'){
                if(st.size()==0 || st.peek()!='(') return false;
                st.pop();
            }
            else if(ch=='}'){
                if(st.size()==0 || st.peek()!='{') return false;
                st.pop();
            }
            else if(ch==']'){
                if(st.size()==0 || st.peek()!='[') return false;
                st.pop();
            }


        }
        return st.size()==0;


    }


}
