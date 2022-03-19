package Inheritance2;



public class Mammal extends Animal{

    public Mammal(int age){
        super();
        System.out.println("Child constructor called by this()");
    }

    public Mammal(){
        this(12);
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {

        Mammal mammal=new Mammal();


    }
}
