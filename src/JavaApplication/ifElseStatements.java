package JavaApplication;

import java.util.Scanner;

public class ifElseStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the Students Grade");
        int studentGrade=scan.nextInt();
        /*if (studentGrade >= 90)
            System.out.println("A");
        else
        if (studentGrade >= 80)
            System.out.println("B");
       else
        if (studentGrade >= 70)
            System.out.println("C");
        else
        if (studentGrade >= 60)
            System.out.println("D");
        else
            System.out.println("F");

         */
        if (studentGrade >= 90)
            System.out.println("A");
        else if (studentGrade >= 80)
            System.out.println("B");
        else if (studentGrade >= 70)
            System.out.println("C");
        else if (studentGrade >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
