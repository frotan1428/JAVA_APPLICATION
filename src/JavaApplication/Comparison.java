package JavaApplication;

import java.util.Scanner;

// Compare integers using if statements, relational operators and equality operators.
public class Comparison {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1=scan.nextInt();
        System.out.print("Enter Second integer: ");
        int number2=scan.nextInt();

        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d%n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d%n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d%n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1, number2);

    }
}
