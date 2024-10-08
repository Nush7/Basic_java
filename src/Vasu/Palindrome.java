package Vasu;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for palindrome");
        System.out.println("Enter 2 for niven");
        int choice = sc.nextInt();
        System.out.println("Enter a Number");
        int num = sc.nextInt();
        switch (choice){
            case 1:
                int temp = num;
                int rev = 0;
                while(temp>0) {
                    int d = temp % 10;
                    rev = rev * 10 + d;
                    temp = temp / 10;
                }
                //System.out.println(rev);
                if(rev==num) {
                    System.out.println("It is a Palindrome Num");
                }
                else{
                    System.out.println("It is not a Palindrome Num");
                }
                break;
            case 2:
                int temp2= num;
                int sum=0;
                while(temp2>0){
                    int d1= temp2%10;
                    sum=sum+ d1;
                    temp2= temp2/10;

                }
                if(num%sum ==0){
                    System.out.println("It is a niven number");
                }
                else{
                    System.out.println("not a niven no.");
                }
                break;
            default:
                System.out.println("Not a valid choice");

        }

    }


}
