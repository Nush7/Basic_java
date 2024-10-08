package STRINGS;

import java.util.Scanner;
//Using StringBuilder
public class Toggle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder str= new StringBuilder(sc.nextLine());
        System.out.println(str);
        //Toggle Code
        for (int i=0; i< str.length(); i++){
            boolean flag= true; //capital
            char ch= str.charAt(i);
            if(ch==' '){
                continue;
            }
            int ascii= (int)ch;
            if(ascii>=97){ //small
                flag= false;
            }
            if(flag== true){ //capital
                ascii += 32;
                char dh= (char)ascii;
                str.setCharAt(i,dh);
            }
            else{ //small
                ascii -= 32;
                char dh= (char)ascii;
                str.setCharAt(i, dh);
            }
        }
        System.out.println(str);
    }

}
