package Coding_Ninjas;

public class Temperature {
    public static void conversion(int s, int e, int w){
        int fah;
        for (int i=s;i<=e;i+=w){
           fah=(int)((5.0/9)*(i-32));
            System.out.println(i+"\t"+fah);
        }
    }
    public static void main(String[] args) {
        conversion(50,80,5);
    }

}
