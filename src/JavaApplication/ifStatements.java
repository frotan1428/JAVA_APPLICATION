package JavaApplication;

import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter The StudentGrade");
        int studentGrade=scan.nextInt();
        System.out.println(studentGrade);
        if(studentGrade>=60){
            System.out.println("Student Get Certificate");
        }else{
            System.out.println("student do not get certificate");
        }

        if (studentGrade>=90){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
}
