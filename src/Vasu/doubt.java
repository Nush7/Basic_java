package Vasu;

import java.util.Scanner;

public class doubt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        int t = num, rev_num1 = 0, rev_num2 = 0;
        while (t != 0) {
            int d = t % 10;
            rev_num1 = rev_num1 * 10 + d;
            t = t / 10;
        }
        int num_sq1 = num * num;
        int num_sq2 = rev_num1 * rev_num1;
        while (num_sq2 != 0) {
            int d = num_sq2 % 10;
            rev_num2 = rev_num2 * 10 + d;
            num_sq2 = num_sq2 / 10;
        }
        if (num_sq1 == rev_num2) {
            System.out.println("Prime adam number");
        } else {
            System.out.println("Not a Prime Adam Number");
        }


    }

}
