package Vasu;

public class Pattern4 {
    public static void main(String[] args) {
        int k = 10;
        for (int i = 4; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k-- + " ");
            }
            System.out.println();

        }
    }
}



