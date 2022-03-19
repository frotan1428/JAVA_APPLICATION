package GfgExpetions;

public class E06 {
    public static void main(String[] args)
    {
        // array of size 4.
        int[] arr = new int[2];

        // this statement causes an exception
       try {
           int i = arr[1];
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e.getMessage());
       }

        // the following statement will never execute
        System.out.println("Hi, I want to execute");
    }
}
