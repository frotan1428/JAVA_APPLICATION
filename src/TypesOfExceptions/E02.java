package TypesOfExceptions;
//Java program to demonstrate NullPointerException

public class E02 {

    public static void main(String[] args) {

        String s=null;

      try {
          System.out.println(s.charAt(0));
      }catch (NullPointerException e){
          System.out.println("\"NullPointerException..\""+e.getMessage());
      }
    }
}
