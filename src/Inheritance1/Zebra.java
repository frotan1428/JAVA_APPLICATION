package Inheritance1;

import Inheritance.Mammal;

public class Zebra extends Animal{

    public Zebra (){
       super(5);

        System.out.println("Zebra  Constructor");
    }

    public static void main(String[] args) {

        Animal animal=new Zebra();
        Zebra zebra=new Zebra();



    }
}
