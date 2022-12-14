import java.util.*;
public class Duplicate_Brackets {
    public static boolean duplicateBrackets(String exp){
        Stack<Character> st=new Stack<>();

        for(int idx = 0 ; idx < exp.length() ; idx++){
            char ch = exp.charAt(idx);

            if(ch == ')'){
                if(st.peek() == '('){
                    return true; // found an extra set of brackets
                }else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop(); // for opening bracket
                }
            }else if(ch == ' '){
                continue;
            }else {
                st.push(ch);
            }
        }

        return false;
    }


    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();
        System.out.println(duplicateBrackets(exp));
    }

}
