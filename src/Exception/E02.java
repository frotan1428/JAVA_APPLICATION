package Exception;

import java.util.Scanner;

public class E02 {

    int a;
    int b;

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 2 integer");
        int a=scan.nextInt();
        int b=scan.nextInt();

        E02 e02=new E02(a,b);
        try {
            int getArea=e02.a/ e02.b;
            System.out.println(" The area "+getArea);
        }catch (ArithmeticException e){

            System.err.println("You can not dived a number by zero"+ e.getMessage());
        }



    }

    public E02(int a, int b) {


        this.a = a;
        this.b = b;

    }
}
