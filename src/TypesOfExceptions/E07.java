package TypesOfExceptions;

public class E07 {
    // Java program to demonstrate the working
// of throw keyword in exception handling


        public static void main(String[] args)
        {
            // Use of unchecked Exception
            try {
                double x=3/0;
                throw new ArithmeticException();
            }
            catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }


}
