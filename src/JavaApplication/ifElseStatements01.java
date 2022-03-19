package JavaApplication;

import java.util.Scanner;

public class ifElseStatements01 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Student Grade");
        int studentGrade=scan.nextInt();

        if (studentGrade>=60){
            System.out.println("passed:congratulation");
        }else{
            System.out.println("failed:");
            System.out.println("You Must take this Course again");
        }
    }
}
