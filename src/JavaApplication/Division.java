package JavaApplication;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1=scan.nextInt();
        System.out.print("Enter Second integer: ");
        int num2=scan.nextInt();
        int result=num1/num2;
        System.out.println("Division is  :" +result);
        //System.out.printf("Division  is %d%n", result);

    }
}
