package Vasu;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 no");
        int num1 = sc.nextInt();
        System.out.println("Enter 2 no");
        int num2 = sc.nextInt();
        System.out.println("Enter 1 for sum and 2 for diff");
        int ch = sc.nextInt();
        int sum,diff;
        switch(ch)
        {
            case 1 : sum = num1 + num2;
                System.out.println("Sum is "+sum);
                break;
            case 2 : if (num1>num2) {
                diff = num1 - num2;
            }
                else {
                diff = num2 - num1;
            }
                break;
            default :
                    System.out.println("Wrong Choice");

                }

            }

        }




