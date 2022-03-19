package TypesOfExceptions;

public class E08 {

    public static void main(String[] args) {

        goToAge(12);
    }

    public static void goToAge(int age){
         if (age>=0){
             System.out.println(age);
         }else {
             throw  new IllegalArgumentException("age can not be Negative:");
         }

    }
}
