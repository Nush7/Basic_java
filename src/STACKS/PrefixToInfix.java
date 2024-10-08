package STACKS;

import java.util.Stack;

public class PrefixToInfix {
    static boolean isOP(char ch){
        if(ch == '+' || ch == '-' || ch == '*' || ch == '/') return true;
        return false;
    }

    public static String prefixToInfixConversion(String exp) {
        Stack<String> st= new Stack<>();
        for(int i=exp.length()-1; i>=0; i--){
            if(isOP(exp.charAt(i))){
                String op1=st.pop();
                String op2=st.pop();
                st.push('('+op1+exp.charAt(i)+op2+')');
            }
            else{
                st.push(""+exp.charAt(i));
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String s=prefixToInfixConversion("+a*bd");
        System.out.println(s);
    }

}
