package TypesOfExceptions;


// Java program to demonstrate ArithmeticException

import java.util.Scanner;

public class E01 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();

        try {
            int c=a/b;
            System.out.println("The Dived of a+b:"+c);
        }catch (ArithmeticException ex){
            System.err.println("Can't divide a number by 0"+ex.getMessage());
        }


    }
}
