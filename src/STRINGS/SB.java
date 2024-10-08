package STRINGS;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i=0; i<26; i++){
            char ch= (char)('a'+i);
            builder.append(ch);
        }

        System.out.println(builder.toString());
    }
}

//to take input using StringBuilder
//StringBuilder str= new StringBuilder(sc.nextLine());