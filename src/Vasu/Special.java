package Vasu;

import java.util.Scanner;

public class Special {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (temp!= 0) {
            int d = temp % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            temp = temp / 10;
        }
        if (num==sum) {
            System.out.println("It is a special no.");
        } else {
            System.out.println("Not a special no.");
        }

    }
}



