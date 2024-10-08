package OOPS;

public class Syntax {
    public static class Student{
        //creating a new data type with multiple attributes
        String name;
        int rollno;
        double percent;
    }
    public static void main(String[] args) {
        Student x = new Student();
        x.name="Anushka";
        x.rollno= 7;
        x.percent= 94.6;
        System.out.println(x.name); //Anushka
    }

}
