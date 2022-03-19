package GfgExpetions;

public class E02 {

    public static void main(String[] args) {
       // add(2,0);
        add(12,4);

    }
    public static void add(int a,int b){
     try {
         System.out.println("a/b=:"+ a/b);
     }catch (ArithmeticException e){
         System.out.println("not number can be dived to zero"+ e.getMessage());
     }

    }
}
