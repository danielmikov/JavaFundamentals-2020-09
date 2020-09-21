package Exercises.Ex01_BasicSyntaxConditionalStatementsLoops_MoreExercies;

import java.util.Scanner;

public class Ex01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int largest = Math.max(Math.max(number1, number2),number3);
        int smallest = Math.min(Math.min(number1, number2),number3);
        int middle = (number1 + number2 + number3) - (largest + smallest);

        System.out.println(largest);
        System.out.println(middle);
        System.out.println(smallest);
    }
}
