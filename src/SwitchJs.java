import java.util.Scanner;

public class SwitchJs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char c= sc.next().charAt(0);
        String s=String.valueOf(c);
        s.toLowerCase();
        switch(s){
            case ("e"):
                System.out.println("Early Bird Ticket");
                break;
            case ("d"):
                System.out.println("Discount Ticket");
                break;
            case ("v"):
                System.out.println("VIP Ticket");
                break;
            case ("s"):
                System.out.println("Standard Ticket");
                break;
            case ("c"):
                System.out.println("Children Ticket");
                break;
            default:
                System.out.println("invalid input");
        }

    }

}
