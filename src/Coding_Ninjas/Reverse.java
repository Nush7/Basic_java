package Coding_Ninjas;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int count=0;
        int sum=0;
        while (n>0){
            int last=n%10;
            sum=sum+last;
            n=n/10;
            rev=rev*10+last;
            count++;
        }
        System.out.println("No. of digits = "+count);
        System.out.println("Sum of digits = "+sum);
        System.out.println("Reverse of no. = "+rev);
    }

}
