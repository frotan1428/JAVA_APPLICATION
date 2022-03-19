package JavaApplication;

import java.util.Scanner;

public class nestedIfElseStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Average od students");

        double average=scan.nextDouble();
        if (average >= 90.0)
            System.out.println("letterGrade" +"A");
        else if (average >= 80.0)
            System.out.println("letterGrade" +"B");
        else if (average >= 70.0)
            System.out.println("letterGrade" +"C");
        else if (average >= 60.0)
            System.out.println("letterGrade" +"D");
        else
            System.out.println("letterGrade" +"F");
    }
}
