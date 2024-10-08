package RECURSION;

public class SeriesSum {
    public static int sumOfSeries(int n) {
        if (n == 0) {
            return n;
        }

        int smallAns = sumOfSeries(n - 1);

        if (n % 2 == 0) {
            return smallAns - n;
        } else {
            return smallAns + n;
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfSeries(n));
    }

}
