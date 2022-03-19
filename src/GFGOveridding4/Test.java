package GFGOveridding4;

public class Test extends Derived{
    @Override
    public void getDetails() {
        System.out.println("Test Class ");
        super.getDetails();

    }

    public static void main(String[] args) {

        Derived test=new Derived();
        test.getDetails();

    }
}
