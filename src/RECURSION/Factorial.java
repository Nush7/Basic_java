package RECURSION;

import java.util.Scanner;

public class Factorial {
    public static int  factorial(int n){
        //base case or halting condition
        if(n==0){
            return 1;
        }
        //sub problem
        int smallAns= factorial(n-1);

        //self work
        int ans = n* smallAns;
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(factorial(n));




    }

}
