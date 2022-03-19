package GfgExpetions;

public class E03 {

    public static void main(String args[]){

         E03 e03=new E03();

        computeDivision(12,12);

    }

    private static int computeDivision(int a, int b) {
        try
        {
            System.out.println(a/b);

        }
        // matching ArithmeticException
        catch(ArithmeticException ex)
        {
            // getMessage will print description of exception(here / by zero)
            System.out.println(ex.getMessage());
        }
        return a/b;
    }
}
