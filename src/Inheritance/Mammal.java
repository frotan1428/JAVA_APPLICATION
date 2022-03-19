package Inheritance;


public class Mammal extends Animal{

    boolean isFly=true;
    String  name="Bat";
    public void see(){

        System.out.println("I can not see");
    }

    public static void main(String[] args) {



        Mammal mammal=new Mammal();
        mammal.see();
        mammal.feed();

        System.out.println(mammal.isFly);
        System.out.println(mammal.name);
        System.out.println(mammal.isBirth);



    }
}
