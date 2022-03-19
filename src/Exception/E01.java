package Exception;

import java.util.Scanner;

public class E01 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 2 integer");
        int a=scan.nextInt();
        int b=scan.nextInt();
        getArea(a,b);

    }


    public static void getArea(int a, int b){

        System.out.println(a*b);
    }
}
