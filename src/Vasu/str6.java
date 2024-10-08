package Vasu;

public class str6 {
    static void check(String str, char ch) {
        str = str.toLowerCase();
        int l = str.length();
        int c = 0;
        for (int i = 0; i < l; i++) {
            if (ch == str.charAt(i))
                c++;
        }
        System.out.println("number of" + (ch) + "present :" + c);
    }

    static void check(String s1) {
        s1 = s1.toLowerCase();
        int l1 = s1.length();

        for (int i = 0; i < l1; i++) {
            char ch1 = s1.charAt(i);
            if (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
                System.out.println(ch1 + " ");
        }
    }
    public static void main(String arg[]){
        check("missipissi", 's');
        check("computer");
    }



}
