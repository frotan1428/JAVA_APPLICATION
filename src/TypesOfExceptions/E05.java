package TypesOfExceptions;

// Java program to demonstrate NumberFormatException

public class E05 {


    public static void main(String[] args) {


        try {
            int num = Integer.parseInt("ali");
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("\"Number format exception\""+ e.getMessage());
        }
    }
}
