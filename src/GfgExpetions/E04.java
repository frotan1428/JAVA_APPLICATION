package GfgExpetions;

public class E04 {

    public static void main(String[] args) {

        String arr[]={"1","2","3"};
        try {
            System.out.println(arr[0]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("The size of array out :"+ex.getMessage());
        }

    }
}
