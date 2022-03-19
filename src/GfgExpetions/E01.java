package GfgExpetions;

public class E01 {

    public static void main(String[] args) {
        String len=null;
        try {

            System.out.println(len.length());
        }catch (NullPointerException e){
            System.err.println("Lentgh of String can not be :"+e.getMessage());
        }
    }
}
