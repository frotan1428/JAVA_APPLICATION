package GFGOveridding;

public class AnimalsRunner {

    public static void main(String[] args) {

        Animals animals=new Animals();

        animals.drink();
        animals.eat();
        animals.Move();

        Animals animals1=new Dog();

        animals1.Move();
        animals1.eat();
        animals1.drink();


    }
}
