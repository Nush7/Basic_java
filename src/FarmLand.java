import java.util.Scanner;

public class FarmLand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y, x1, y1, x2, y2;
        x = Math.abs(scanner.nextInt());
        y = Math.abs(scanner.nextInt());
        x1 = Math.abs(scanner.nextInt());
        y1 = Math.abs(scanner.nextInt());
        x2 = Math.abs(scanner.nextInt());
        y2 = Math.abs(scanner.nextInt());

        int r1 = (int) Math.ceil(Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2)));
        int r2 = (int) Math.ceil(Math.sqrt(Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2)));
        int a1 = (int) Math.ceil(3.14 * Math.pow(r1, 2));
        int a2 = (int) Math.ceil(3.14 * Math.pow(r2, 2));

        if (a2 > a1) {
            int e = a2 - a1;
            int f = (int) Math.ceil(Math.sqrt(e));
            int g = f * f;
            int h = g - e;
            int i = h * 20;
            System.out.println("Krishna " + i);
        } else if (a1 > a2) {
            int p = a1 - a2;
            int q = p * 20;
            System.out.println("Shiva " + q);
        } else if (a1 == a2) {
            System.out.println("-1");
        }

        scanner.close();
    }
}
