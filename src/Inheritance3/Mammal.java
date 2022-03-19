package Inheritance3;


public class Mammal extends Animal{

    private int num3=12;
    public String name2="Veli";
    private  int num4=13;

    public Mammal(){

        System.out.println(this.num1);
        System.out.println(super.num1);

        System.out.println(this.getNum2());
        System.out.println(super.getNum2());

        this.setNum2(23);

        System.out.println(this.getNum2());
        System.out.println(super.getNum2());

        super.setNum2(24);

        System.out.println(this.getNum2());
        System.out.println(super.getNum2());


        System.out.println(this.num3);
        System.out.println(this.num4);

        System.out.println(super.name);
        System.out.println(this.name);

        System.out.println(this.name2);

    }





    public static void main(String[] args) {

        Mammal animal=new Mammal();

    }
}
