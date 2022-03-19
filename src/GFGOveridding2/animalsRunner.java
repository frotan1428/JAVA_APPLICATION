package GFGOveridding2;

public class animalsRunner {

    public static void main(String[] args) {

        Animal animal=new Animal();
        animal.eat();
        animal.move();

        Lamb lamb = new Lamb();
        lamb.eat();
        lamb.move();

        Dog dog =new Dog();
        dog.move();
        dog.eat();
    }
}
