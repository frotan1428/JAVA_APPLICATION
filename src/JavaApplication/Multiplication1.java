package JavaApplication;

import java.util.Scanner;

public class Multiplication1 {
    public static void main(String[] args) {

        Scanner sca=new Scanner(System.in);
        System.out.println("Enter value X:");
        int x= sca.nextInt();
        System.out.println("Enter value Y:");
        int y= sca.nextInt();
        System.out.println("Enter value Z:");
        int z= sca.nextInt();
        int product=x*y*z;
        System.out.println("Product is :"+product);


    }
}
