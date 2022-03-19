package TypesOfExceptions;
// Java program to demonstrate StringIndexOutOfBoundsException
public class E03 {

    public static void main(String[] args) {

        String st="I love hafasa";
        System.out.println(st.length());//13

        try {
            System.out.println(st.charAt(11));
        }catch (StringIndexOutOfBoundsException e){
            System.err.println("StringIndexOutOfBoundsException :"+e.getMessage());
        }
    }
}
