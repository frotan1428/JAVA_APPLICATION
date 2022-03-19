package Constructor;

public class Geek {

   public  String  name="ali";
   protected int age=12;
    public static void main(String[] args) {

        Geek g1=new Geek();
        System.out.println(g1.age);
        System.out.println(g1.name);
    }

    public  Geek() {

        System.out.println("Constructor Called");
    }
}
