package GFGOveridding2;

public class Dog extends Animal{
    @Override
    public void eat() {

        System.out.println("Dog eat meat");
    }

    @Override
    public void move() {
        System.out.println("Dog Move");
    }
}
