package GFGOveridding3;

public class Cat extends Animals{

    @Override
    public void sound() {
        System.out.println("Cats Meow");//Overriding method
    }

    public static void main(String[] args) {

        Animals cat=new Animals();

    }
}
