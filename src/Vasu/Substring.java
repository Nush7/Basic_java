package Vasu;

public class Substring {
    static String[] solution(String[] a) {
        int n = a.length;
        String[] sol = new String[n];
        for (int i = 0; i < n; i++) {

            if (i + 1 == n) {
                String x = a[i];
                String y = a[0];
                int yl = y.length();
                sol[i] = String.valueOf(x.charAt(0)) + String.valueOf(y.charAt(yl - 1));
            } else {
                String s1 = a[i];
                String s2 = a[i + 1];
                int n1 = s1.length();
                int n2 = s2.length();
                sol[i] = String.valueOf(s1.charAt(0)) + String.valueOf(s2.charAt(n2 - 1));
            }
        }
        return sol;
}
    public static void main(String[] args) {
            String[] arr= {"I", "have", "a", "nice", "surprise"};
            int n= arr.length;
            String[] sol= solution(arr);
            for(String val: sol){
                System.out.print(val +" ");
            }
        }

    }


