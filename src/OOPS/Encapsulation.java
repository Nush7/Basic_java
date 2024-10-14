package OOPS;
class ImplementEncap{
    private String name;
    private int id;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name= name;
    }
    public void setId(int id){
        this.id= id;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        ImplementEncap obj= new ImplementEncap();
        obj.setName("Anushka");
        obj.setId(7);
        System.out.println(obj.getName());
        System.out.println(obj.getId());

    }

}
