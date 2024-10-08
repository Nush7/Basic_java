package Coding_Ninjas;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int term;
        for (int i=1;i<=x;i++){
            term=3*i+2;
            if(term%4==0){
                continue;
            }
            else {
                System.out.println(term);
            }
        }
    }

}
