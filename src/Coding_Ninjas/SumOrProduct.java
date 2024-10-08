package Coding_Ninjas;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int sum=0;
        int prod=1;
        if(c==1){
            for (int i=1;i<=n;i++){
                sum+=i;
            }
            System.out.println("sum is "+sum);
        }
        else if(c==2){
            for (int i=1;i<=n;i++){
                prod*=i;
            }
            System.out.println("product is "+prod);
        }
        else {
            System.out.println("-1");
        }
    }

}
