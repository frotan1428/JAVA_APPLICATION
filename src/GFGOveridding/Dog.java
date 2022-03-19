package GFGOveridding;

public class Dog extends Animals{

    public void bark(){

        System.out.println("Dog barks");

    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void drink() {
        System.out.println("Dog drink");
    }

    @Override
    public void Move() {
        System.out.println("Dog Move");
    }
}
