package TypesOfExceptions;
// Java program to demonstrate ArrayIndexOutOfBoundException
public class E06 {

    public static void main(String[] args) {
        int arr[]=new int[4];

       try {
           int i=arr[5];
           System.out.println(i);
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Array Index is Out Of Bounds "+e.getMessage());
       }
    }



}
