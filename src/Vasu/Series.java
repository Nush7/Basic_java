package Vasu;


import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + (1.0 / i);

        }
        System.out.println("Sum of first series :" + sum);

        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        double sum1 = 0;
        for (int j = 1; j <= n; j++) {
            sum1 = sum1 + (Math.pow(x, j) / j);
        }
        System.out.println("Sum of second series : " + sum1);
    }





    }


