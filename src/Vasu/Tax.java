package Vasu;

import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String nm = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        double IT = 0.0;
        if (age > 60) {
            System.out.println("Wrong category");
        }
        else{
            System.out.println("Enter the Taxable Income");
            int tax_inc = sc.nextInt();

            if (tax_inc <= 250000) {
                IT = 0;
            }
            else if (tax_inc > 250000 && tax_inc <= 500000) {
                IT = (tax_inc - 160000) * 10 / 100;
            }

            else if (tax_inc > 500000 && tax_inc <= 1000000) {
                IT = ((tax_inc - 500000) * 20 / 100) + 34000;
            }

            else{
                IT = ((tax_inc-1000000)* 30 / 100) + 94000;

            }
        }
        System.out.println("Name of tax payer :"+nm);
        System.out.println("Tax payable :"+IT);
    }
}