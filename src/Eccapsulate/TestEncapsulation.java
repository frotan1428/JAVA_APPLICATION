package Eccapsulate;

public class TestEncapsulation {
    public static void main(String[] args) {

        Encapsulate encapsulate=new Encapsulate();

        encapsulate.setGeekAge(2);
        encapsulate.setGeekName("HAFASA");
        encapsulate.setGeekRoll(1427);

        System.out.println("Age: "+encapsulate.getGeekAge());
        System.out.println("Name: "+encapsulate.getGeekName());
        System.out.println("Roll: "+encapsulate.getGeekRoll());

        Encapsulate obj1=new Encapsulate();
        obj1.setGeekName("KHAN");

        String ob1= obj1.getGeekName();

        obj1.setGeekName("****"+ob1.substring(ob1.length()-2));
        System.out.println(ob1);

    }
}
