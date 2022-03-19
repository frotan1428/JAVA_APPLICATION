package GFGOveridding3;

public class Dog extends Animals{

    @Override
    public void sound() {
        System.out.println("Dog bark");//Overriding method
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
         dog.sound();
    }
}
