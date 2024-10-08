package STRINGS;
//Using String
public class ToggleString {
    public static void main(String[] args) {
        String str= "PHYsics";
        for (int i=0; i< str.length(); i++){
            boolean flag= true; //capital
            char ch= str.charAt(i);
            if(ch==' '){
                continue;
            }
            int ascii= (int)ch;
            if(ascii>=97){ //small
                flag= false;
            }
            if(flag== true){ //capital
                ascii += 32;
                char dh= (char)ascii;
                str = str.substring(0,i)+ dh+ str.substring(i+1);
            }
            else{ //small
                ascii -= 32;
                char dh= (char)ascii;
                str = str.substring(0,i)+ dh+ str.substring(i+1);
            }
        }
        System.out.println(str);
    }
//this is a poor code with more time complexity
// so it is suggested to convert the given string to StringBuilder
}
