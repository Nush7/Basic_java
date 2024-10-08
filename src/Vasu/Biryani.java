package Vasu;

import java.util.Scanner;

public class Biryani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        double r;
        r =(Math.sqrt(a)+Math.pow(b,2)-Math.sqrt(c));
        System.out.println("R :"+r);
    }
    }


