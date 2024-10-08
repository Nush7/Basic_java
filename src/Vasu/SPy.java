package Vasu;
public class SPy {
            public static void main(String[] args) {
                int num = 2;
                while (num <= 5) {
                    int fact = 1;
                    int i = 2;
                    while (i <= num) {
                        fact *= i;
                        i += 2;
                    }
                    System.out.println("Factorial of " + num + " is " + fact);
                    num += 2;
                }
            }
        }
