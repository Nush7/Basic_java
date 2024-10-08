package Vasu;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER any 20 nos.");
        int sum = 0;
        int sumTotal = 0;
        int countOdd = 0;
        double avg= 0;
        for (int i = 1; i <= 20; i++) {
            int n = sc.nextInt();

            if (n % 2 == 0) {
                sum = sum + n;
            } else {
                countOdd++;
            }

            sumTotal = sumTotal + n;
            avg = sumTotal / 20;

        }
        System.out.println("Sum of even nos.= " + sum);
        System.out.println("Number of odd nos.= "+ countOdd);
        System.out.println("Average= "+ avg);
    }

}
